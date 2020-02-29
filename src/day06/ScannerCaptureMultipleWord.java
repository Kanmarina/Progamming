package day06;
import java.util.Scanner;
public class ScannerCaptureMultipleWord {
    private static Object CybertekSchool;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         System.out.println("What is your name ? ");
        String name = scan.next();
        String anotherWord = scan.next();

        System.out.println("You have entered " + name );
        System.out.println("Another word is " + anotherWord ); 

       // System.out.println("What is your name ? ");
        //nextLine method of scanner is used to capture whole line
      /* String name = scan.next();

        System.out.println("What is your name ? ");
        String name = scan.nextLine();
        System.out.println("You have entered " + name );


        System.out.println("What is your city, state ? ");
        String city = scan.nextLine();
        System.out.println("You have entered " + city );


        System.out.println("What is your street address ? ");
        String streetAddress = scan.nextLine();
        System.out.println("You have entered " + streetAddress );

        System.out.println(" What is your bio " + name  +  city
        +  streetAddress);
       */









    }




}


