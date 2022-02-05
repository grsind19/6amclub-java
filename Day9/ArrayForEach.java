class ArrayForEach {
    public static void main(String[] args) {
        String[] students = {"Arun","Sutheesh","thivakar","Raju","Arun","Arun"};
        int count=0;
        for (String student:students) {
            if(student=="Arun"){
                count++;
            }
        }
        int county = 0;
        int[][] classy = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] item:classy){
            for (int elem: item){
                System.out.println(elem);
                if(elem%2==1){
                    county++;
                }
            }
        }
        System.out.println(county);
    }
}
