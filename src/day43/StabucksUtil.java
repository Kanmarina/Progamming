package day43;

public class StabucksUtil {
    public static void main(String[] args) {
   //     Coffee c = new Coffee("Blonde",5,1.6);
   //     printCoffeInfo(c);
        String myString = new String(("Hello"));
        printStringInfo(myString);
    }
    //create a static method to accept a coffee object and print its information
    //name, price. level
    //This coffee is : name, price is , caffeine level is ,
 //   public static void printCoffeInfo(Coffee co){
  //      System.out.println("This coffee is : "+ co.getType());
     //   System.out.println("Price is : "+ co.getPrice());
       // System.out.println("CaffeineLevel is : "+co.getCaffeineLevel);
 //   }
    public static void printStringInfo(String str){
        System.out.println("first char is "+ str.charAt(0));
        System.out.println("last char is "+ str.charAt((str.length()-1)));
    }
}
