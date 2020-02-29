package day06;
import java.util.Scanner;
public class ScannerCounting {
    public static void main(String[] args) {

       /* Create a program to calculate the final discounted price
        of an Item

        Create 3 double variables  called  regularPrice , salePrice
        and discount

       Ask user question using scanner for regularPrice and discountPercentage
         And save the result into the variable

      Calculate sale price using above information
         For example :  80 regular price , 0.2 for discount  ,
         salePrice —>> 64


        Print out  : regular price is 80$ , discount is 0.2
         and your got deal for 64 $
        */
       Scanner scan = new Scanner(System.in);




        System.out.println("What is regular price of the dress : ");
        double regularPriceDress = scan.nextDouble();
       // System.out.println("What is sale price of the dress : ");
        //double salePriceDress = scan.nextDouble();
        System.out.println("What is discount of the dress : ");
        double discountDress = scan.nextDouble();

        double salePriceDress = regularPriceDress - regularPriceDress * discountDress;
        System.out.println("Your regular price is " + regularPriceDress
                +"$ ," + " your discount is " + discountDress +
                " and your got deal for " + salePriceDress +    "$" );

    }
}
