package day18;

import java.util.Scanner;

public class SmartLockDoor_DoWhile {
    public static void main(String[] args) {
        // smart lock has password
        //unless you enter correct password
        //assuming correct password is B15
        //until user enter correct one

        Scanner scan = new Scanner(System.in);


        String password  ;
        do {
            System.out.println("whats the password");
            password = scan.next();
        }
        while (!password.equals("B15"))  ;
            System.out.println("Door is open");




        }
    }
