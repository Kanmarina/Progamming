package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name :");
        String name = scan.next();
        System.out.println("Your name is " + name);

        scan.nextLine();

        System.out.println("What is your age :");
         //String age = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("Your age is " + age);
        scan.nextLine();

        System.out.println("What is your address :");
        String address = scan.nextLine();
        System.out.println("Your address is " + address);






    }
}
