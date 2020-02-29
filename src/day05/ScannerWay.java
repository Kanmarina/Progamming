package day05;
import java.util.Scanner;

public class ScannerWay {
    public static void main(String[] args) {
         //ask user for name
        //and capture the result
        // print your name is
        //ask user for birth year
        //and capture the result
        //print the age
        //ask user for height
        //and capture the result
        //print the height

        // Create scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");
        //String name = "Sam ";
        String name = scan.next();
        System.out.println("Your name is  :  " + name);

        System.out.println("What is your birth year : ");
        int birthYear = scan.nextInt();
        System.out.println("Your birth year is  :  " + birthYear);

        System.out.println("What is your height : ");
        double height = scan.nextDouble();
        System.out.println("Your height is  :  " + height);



        Scanner input = new Scanner (System.in);
        System.out.println(" are you recording ? ");
        boolean isRecording = input.nextBoolean();
        System.out.println("We are recording " + isRecording);




    }
}
