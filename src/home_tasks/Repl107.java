package home_tasks;

import java.util.Scanner;

public class Repl107 {
    public static void main(String[] args) {
        int num, digit1 ,digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner (System.in);

        System.out.println(" Enter your number:"  );
 num =scan.nextInt();


        for(digit1 =1; digit1>=num/digit1;digit1--){

            System.out.print  ( digit1 +" ");
        }
    }
}
