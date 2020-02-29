package day10;

public class MiltibranchesSwitches {
    public static void main(String[] args) {


        System.out.println("Welcome to MCDOnald, what can I get for you?");


        String order = "";
        int itemNumber = 11;

        switch (itemNumber){

            case 11:
                System.out.println(" you have selected 11");
                order = "burger";
                break;
            case 5:
                System.out.println(" you have selected 5");
                order = "fry";
                break;
            case 35:
                System.out.println(" you have selected 35");
                order = "dry";
                break;
            case 15:
                System.out.println(" you have selected 15");
                order = "kids";
                break;

            default:
                System.out.println("You have selected unknown");
        }
        System.out.println(" Your order is "+ order);


    }
}
