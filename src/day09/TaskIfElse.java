package day09;

import java.util.Scanner;

public class TaskIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int myNumber = scan.nextInt();
        if (myNumber %2==0){
            System.out.println("This is an even number!");
        }else{
            System.out.println("This is an odd number!");
        }


    }
}
