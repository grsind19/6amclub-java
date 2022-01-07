import java.util.Scanner;

class Condition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first nummber");
        int num1 = scan.nextInt();
        System.out.println("Enter the second nummber");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("The first number is greater than second number");
        }else if(num1<num2){
            System.out.println("The first number is less than second number");
        }else{
            System.out.println("The netered number is equal");
        }
    }
}