class Switchex {
    public static void main(String[] args) {
        String country = "USK";

        switch (country){
            case "US":
                System.out.println(country);
                break;
            case "UK":
                System.out.println(country);
                break;
            case "AUS":
                System.out.println(country);
                break;
            default:
                System.out.println("No country detected");
        }
    }
}