package day06;

import java.util.Scanner;

public class UsingTheValueOfTheVariables {
    public static void main(String[] args) {


        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;
        System.out.println("My favorite number " + myFavoriteNumber);
        System.out.println("Your favorite number "
                + yourFavoriteNumber );

        yourFavoriteNumber = 100;
        System.out.println("My favorite number " + myFavoriteNumber);
        System.out.println("Your favorite number "
                + yourFavoriteNumber );

        //String yourOrder = "bike";
        //String myOrder = yourOrder;
        //System.out.println("yourOrder is " + yourOrder "like my order "+ myOrder );

Scanner scan = new Scanner(System.in);
        System.out.println("What are your order : ");
         String yourOrder = scan.nextLine();
        String myOrder = yourOrder;
        System.out.println("Your order " + yourOrder + " like my order " + myOrder );
        System.out.println("Your order " + yourOrder + "\n"
                + " like my order ");






    }
}
