class ArrayEx {
    public static void main(String[] args){
        int[] values = new int[4];
        values[0] = 1;
        values[1] = 3;
        values[2] =4;
        values[3]=5;
        System.out.println(values);

//        System.out.println(values[0]);
//        System.out.println(values[1]);
//        System.out.println(values[2]);
//        System.out.println(values[3]);

        String[] names = {"test","first","kill","master","listing"};
        System.out.println(names);

//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);
        names[0] = "new values";
        names[2] = "new 2 values";
        names[3] = "new 3 values";
        System.out.println(names.length);


        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        String[] classy = new String[100];
        classy[20] = "west";

    }
}