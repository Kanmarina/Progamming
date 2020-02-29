package day13;

public class AmazonCalculator2 {
    public static void main(String[] args) {
        //ask create a boolean store the result of doYouWantToShop
        //if yes, do you want go to store or online


        // if user don not whant a shop at all, print good job
        // stay home coding!!
      boolean  YouWantToShop = true;
      String preference = "online";

       if (YouWantToShop == true ){
        //if (YouWantToShop){

           if ( preference.equals("Store")) {
               System.out.println("going to store for shopping");
           }else{
               System.out.println("going to online for shopping");
           }

        }else {
           System.out.println("good job stay home coding!!!");

       }
    }
}
