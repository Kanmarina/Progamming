package day07;


import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {

        //Create 3 string variable for first name last name company
        //create another variable for email
        //create email in this format firstName_lastName@company.com

        //print out the result as, my name is
        // and I work for company and email

      /*  String name = "Marina";
        String lastName = "Kan";
        String company = "Masiso";
        //  email = "name_lastName@company.com"
       String email;

         email =   name + "_" + lastName + "@" + company + ".com " ;

        System.out.println("My name is " +name +
                " and I work for company " + company + " with email "+ email );



       */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your name lastName company and email with space : ");
        String name, lastName, company, email;
        name = scan.next();
        lastName = scan.next();
        company = scan.next();
        //  email = "name_lastName@company.com"


        email =   name + "_" + lastName + "@" + company + ".com " ;

        System.out.println("My name is " +name +
           " and I work for company " + company + " with email "+ email );




    }



}