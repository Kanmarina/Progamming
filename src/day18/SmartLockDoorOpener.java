package day18;

import java.util.Scanner;

public class SmartLockDoorOpener {
    public static void main(String[] args) {
        // smart lock has password
        //unless you enter correct password
        //assuming correct password is B15
        //until user enter correct one

        Scanner scan = new Scanner (System.in);

        System.out.println(" What's the password?");

        String password = scan.next();

        while (! password.equals ("B15")){
            System.out.println("Wrong password! Try again");
            password = scan.next();
        }
        System.out.println("open Simsim");

    }
}
