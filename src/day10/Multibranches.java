package day10;

public class Multibranches {
    public static void main(String[] args) {

        //At the McDonald drive thru
        System.out.println("Welcome to MCDOnald, what can I get for you?");


         String order ="";
        int itemNumber = 35;

        if (itemNumber == 11){
            System.out.println(" you have selected 11");
            order = "burger";
        }else if ( itemNumber == 5){
            System.out.println(" you have selected 5");
            order = "french fry";
        }else if ( itemNumber == 8){
            System.out.println(" you have selected 8");
            order = "nuggets";
        }else if ( itemNumber == 35) {
            System.out.println(" you have selected 35");
            order = "ice cream";
        }else{
            System.out.println("You have selected unknown");
        }
        System.out.println(" Your order is "+ order);
    }
}
