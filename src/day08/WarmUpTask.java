package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        /*
        * Voting Eligiability Program
        *
        * Create a variable called age as int
        *
        * check whether this age is more than 18
        * if yes print : you are ready to vote.
        * if it is less 18 print wait untill yaou are 18
        *
        */

       /* int age = 18;
      //  System.out.println( age >= 18);

        if(age >= 18) {
            System.out.println("You are ready to vote");
        }else {
            System.out.println("Wait until you are 18");
        }*/

      Scanner scan = new Scanner(System.in);
        System.out.println("Guess my favorite number :");
        int myFavoriteNumber = scan.nextInt();
        if (myFavoriteNumber == 300){
            System.out.println("Bingo!!!");
        }else{
            System.out.println("Try again later please ");

        }


        }


    }


