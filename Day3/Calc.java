import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        Integer num1;
        Integer num2;
        Integer result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        num1 = scan.nextInt();
        System.out.println("Enter the number 2: ");
        num2 = scan.nextInt();
        System.out.println("Enter the operation:");
        char op = scan.next.charAt(0);
        System.out.println("Operation is : " + op);

        if(op=="+"){
            result = num1 + num2;
            System.out.println("The addition the result is "+ result );
        } else if(op == "-"){
            result = num1 - num2;
            System.out.println("The addition the result is "+ result );
        } else if(op == "*"){
            result = num1 * num2;
            System.out.println("The addition the result is "+ result );
        } else if(op == "/"){
            result = num1 / num2;
            System.out.println("The addition the result is "+ result );
        } else {
            System.out.println("Invaid operator");
        }
    }
}