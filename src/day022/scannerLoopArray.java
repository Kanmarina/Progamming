package day022;

import java.util.Scanner;

public class scannerLoopArray {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter you number " +( i+1 ));

            numbers[i]=scan.nextInt();

            System.out.println(numbers[i]);

        }
//or
        for (int x = 0; x <numbers.length ; x++) {
            System.out.println(numbers[x]+" ");
        }

    }
}
