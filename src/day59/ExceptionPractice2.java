package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {
        // we want to take different action according to
        // different type of exception happen during the program
        // We can have more than one catch block
        // to handle different types of exception
        // and take action according to the exception type at runtime

        System.out.println("The Start" );
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ? ");

try {

    int targetIndex = scan.nextInt();
    System.out.println(name.charAt(targetIndex));
    System.out.println("end of try");
}catch (StringIndexOutOfBoundsException e) {


    System.out.println("you are out of bound" );
}catch (InputMismatchException bla) {
    System.out.println("Input mismatch, enter number");

} catch (Exception e) {
    System.out.println("IF I DONT CATCH ABOVE 2 TYPES I WILL COME HERE!!!");
}

        System.out.println("The end");




    }


}
