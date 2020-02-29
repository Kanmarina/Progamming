package home_tasks;
import java.util.Scanner;

public class Repl023 {


    public static void main(String[] args) {


        //YOUR CODE HERE
        Scanner scan = new Scanner(System.in);


        int localNumber= scan.nextInt();
        int areaCode= scan.nextInt();

        String phoneNumber = "("+areaCode+")-"+localNumber;

        System.out.println("Calling number "+phoneNumber);


    }

}
