class Car {
  public String company;
  public Integer price;
  public Boolean is_sold;
  Car(String _company, Integer _price, Boolean _is_sold){
    this.company = _company;
    this.price = _price;
    this.is_sold = _is_sold;
  }
}
class Main {
  public static void main(String[] args){
    Car car1 = new Car("Toyoto", 20000, false);
    System.out.println(car1.company);
  }
}
