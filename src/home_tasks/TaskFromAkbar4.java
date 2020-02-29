package home_tasks;

import java.util.Scanner;

public class TaskFromAkbar4 {
    public static void main(String[] args) {
        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 1st word with single character");
        String first = scan.next();
        char firstAsChar =first.charAt(0);

        System.out.println("Enter 2nd word with single character to end with");
        String second = scan.next();
        char secondAsChar =second.charAt(0);

        for(char i = firstAsChar; i<= secondAsChar; i++) {


            System.out.println(i + " ");
        }
    }
}
