const html = `<div>
  <h3 dir="ltr">
    <span>Importance of Nature</span>
  </h3>
  <p dir="ltr">
    <span>
      If not for nature then we wouldn&#8217;t be alive. The health benefits of
      nature for humans are incredible. The most important thing for survival
      given by nature is oxygen. The entire cycle of respiration is regulated by
      nature. The oxygen that we inhale is given by trees and the carbon dioxide
      we exhale is getting absorbed by trees.&#160;
    </span>
  </p>
  <p dir="ltr">
    <span>
      The ecosystem of nature is a community in which producers (plants),
      consumers, and decomposers work together in their environment for
      survival. The natural fundamental processes like soil creation,
      photosynthesis, nutrient cycling, and water cycling, allows Earth to
      sustain life. We are dependent on these ecosystem services daily whether
      or not we are aware.
    </span>
  </p>
  <p dir="ltr">
    <span>
      Nature provides us services round the clock: provisional services,
      regulating services, and non-material services. Provisional services
      include benefits extracted from nature such as food, water, natural fuels
      and fibers, and medicinal plants. Regulating services include regulation
      of natural processes that include decomposition, water purification,
      pollution, erosion and flood control, and also, climate regulation.
    </span>
  </p>
  <p dir="ltr">
    <span>
      Non-material services are the non-material benefits that improve the
      cultural development of humans such as recreation, creative inspiration
      from interaction with nature like art, music, architecture, and the
      influence of ecosystems on local and global cultures.&#160;
    </span>
  </p>
  <p dir="ltr">
    <span>
      The interaction between humans and animals, which are a part of nature
      alleviates stress, lessens pain and worries. Nature provides company and
      gives people a sense of purpose.&#160;
    </span>
  </p>
  <p dir="ltr">
    <span>
      Studies and researches have shown that children especially have a natural
      affinity with nature. The regular interaction with nature has boosted
      health development in children. Nature supports their physical and mental
      health and instills abilities to access risks as they grow.&#160;
    </span>
  </p>
  <h3 dir="ltr">Importance of Nature</h3>
  <p dir="ltr">
    If not for nature then we wouldn&#8217;t be alive. The health benefits of
    nature for humans are incredible. The most important thing for survival
    given by nature is oxygen. The entire cycle of respiration is regulated by
    nature. The oxygen that we inhale is given by trees and the carbon dioxide
    we exhale is getting absorbed by trees.&#160;
  </p>
  <p dir="ltr">
    The ecosystem of nature is a community in which producers (plants),
    consumers, and decomposers work together in their environment for survival.
    The natural fundamental processes like soil creation, photosynthesis,
    nutrient cycling, and water cycling, allows Earth to sustain life. We are
    dependent on these ecosystem services daily whether or not we are aware.
  </p>
  <p dir="ltr">
    Nature provides us services round the clock: provisional services,
    regulating services, and non-material services. Provisional services include
    benefits extracted from nature such as food, water, natural fuels and
    fibers, and medicinal plants. Regulating services include regulation of
    natural processes that include decomposition, water purification, pollution,
    erosion and flood control, and also, climate regulation.
  </p>
  <p dir="ltr">
    Non-material services are the non-material benefits that improve the
    cultural development of humans such as recreation, creative inspiration from
    interaction with nature like art, music, architecture, and the influence of
    ecosystems on local and global cultures.&#160;
  </p>
  <p dir="ltr">
    The interaction between humans and animals, which are a part of nature
    alleviates stress, lessens pain and worries. Nature provides company and
    gives people a sense of purpose.&#160;
  </p>
  <p dir="ltr">
    Studies and researches have shown that children especially have a natural
    affinity with nature. The regular interaction with nature has boosted health
    development in children. Nature supports their physical and mental health
    and instills abilities to access risks as they grow.&#160;
  </p>
  <p dir="ltr">shiva</p>
</div>`;

const { JSDOM } = require("jsdom");
const _ = require("lodash")
const jsdom = new JSDOM(`<!DOCTYPE html><html><body>${html}</body></html>`);
const { window } = jsdom;
const { document } = window;
global.window = window;
global.document = document;
const $ = (global.jQuery = require("jquery"));

const children = $("div").children();
console.log(children)
let keys = _.keys(children)
console.log(keys)
keys = _.dropRight(keys , 2)
console.log(keys)
const max_length = 950;
let current_length =0 ;

// [
//   [{},{},{}],
//   [{},{},{}]
// ]
let list = []
let response = []
keys.forEach(element => {
    const innerText = $(children[element]).text()
    if((current_length + innerText.length) <950){
      current_length += innerText.length;
      list.push(children[element])
    }else {
      const temp = _.clone(list); //[{},{},{}]
      response.push(temp)
      list = []
      current_length = innerText.length
      list.push(children[element])
    }
    
    if(element == _.last(keys)){
      const temp = _.clone(list);
      response.push(temp)
    }
});

console.log(response)

response.forEach((item, index) => {
  let length = 0
  console.log(`----- list ${index} starts -----`)
  item.forEach(element => {
    length += $(element).text().length
    console.log($(element).text())
  });
  console.log(length)
  console.log(`----- list ${index} ends -----`)
});