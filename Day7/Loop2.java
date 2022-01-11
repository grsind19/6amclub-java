class Loop2 {
    public static void main(String[] args) {
//        for (int i=0;i<10;i++){
//            System.out.println(i);
//            if(i==5){
//                break;
//            }
//        }

//        for (int i=0;i<10;i++){
//            if(i%2==1){
//                continue;
//            }
//            System.out.println(i);
//        }

        int i = 0;
        while(i<10){
            if(i%2==1){
                i++;
                continue;
            }else{
                System.out.println(i);
                i++;
            }
        }


    }
}