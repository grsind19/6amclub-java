import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);
        int list = scan.nextInt();
        int result = 0;

        String[] students = {"Abi", "Melvin", "Vetri","Arthi","Arun", "ambi"};
//        for(int i=0; i<=list; i++){
//            result = result + i;
//        }
        System.out.println(result);

        for(int i=0 ; i <students.length; i++){
            if(students[i].charAt(0)=='A'|| students[i].charAt(0)=='a'){
                System.out.println(students[i]);
            }
        }

        boolean status = true;
        while(status){
            System.out.println("Enter the name:");
            String name = scan.nextLine();
            System.out.println(name);
            if(name.equals("Arun")){
                System.out.println("Thank you!!!");
                status = false;
            }
        }
        int check = scan.nextInt();
        do{
           System.out.println(check);
           check++;
        }while(check<=6);


    }
}