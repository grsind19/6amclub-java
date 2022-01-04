class Ops {
    public static void main(String[] args) {
          int num1 = 10;
          double num2 = 4;
          int cresult;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

        num2String str1 = "Hello ";
        String str2 = "World";

        String result = str1 + str2;
        System.out.println(result);

        cresult = (int) num1/num2;
        System.out.println(cresult);

        String ans = "hello";
        System.out.println(ans+num1);

        double test = 13.899879347927;
        int itest = (int) test;
        float ftest = (float) test;

        System.out.println(itest);
        System.out.println(ftest);

        System.out.println(++num1);
        System.out.println(num1);

        System.out.println(--num1);
        System.out.println(num1);
        num1 = num1+10;
        num1 += 10


    }
}