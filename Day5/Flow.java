class Flow {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        boolean test = false;
        //Comparison operator
        System.out.println(num1 > num2); //False
        System.out.println(num1 < num2); // True
        System.out.println(num1 == num2); //false
        System.out.println(num1 != num2); //true
        System.out.println(num1 >= num2); //false
        System.out.println(num1 <= num2); //true

        //Logical operator
        System.out.println(--num1>0 && num1 < num2 && num1<=num3 && ++num2<=num3--);
        System.out.println((num1>num2 || num2>0 || num3>0) && (num1>num2 == num3>num2));
        System.out.println(
                ((num1>0 || --num1>=0 ) && !test && num1 >= 0) &&
                        (!test || !test && num2*2 > num3)
        );





    }
}