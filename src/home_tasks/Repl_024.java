package home_tasks;

import java.util.Scanner;

public class Repl_024 {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner (System.in);


        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = scan.next ();
        System.out.println("Enter your last name");
        String lastName = scan.next ();
        String fullName = scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.next ();
        System.out.println("Enter your state");
        String state = scan.next ();
        System.out.println("Enter your zip code");
        int  zipCode= scan.nextInt();



        String address;
                scan.nextLine();
                System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber =scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your email");
        String  email = scan.nextLine();

        String  contacts = scan.nextLine();

        System.out.println("Enter your age");
        scan.nextLine();
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight  = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried  =scan.nextBoolean();

        contacts = "work phone number-"+workPhoneNumber
                +", personal phone number-"+personalPhoneNumber+", email:"+email;
        fullName = firstName+", "+lastName;
        address = street+", "+city+", "+ state+ zipCode;

        System.out.println("Patient personal information" +
                "\nFull name:"+fullName+"\nAddress:"+ address+
                "\nContacts:"+contacts+"\nAge:"+age+"\nHeight:"+height+
                "\nWeight:"+weight+"pounds"+"\nMarried?:"+isMarried);

    }
}

