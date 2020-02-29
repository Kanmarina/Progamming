package day05;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        //task create a prog that ask user Fahrenheit and convert to Celsius
        Scanner input = new Scanner(System.in);
        System.out.println(" What is a tempreture in F : ");
        //double farenheight = 78;
        double farenheight = input.nextDouble();
        double celsius = (5.0 / 9) * (farenheight - 32);
        System.out.println("farenheight " + farenheight + " is "
                + celsius + " in celsius ");

        Scanner scan = new Scanner (System.in);
        System.out.println(" How many minutes in day : " );
        int minutes = scan.nextInt();
        int days = minutes * 24 * 60;
        System.out.println( days +  " minutes in day " );
        //System.out.println(day+ " day is " + minute + " minute");


 /*
        Task 4:
        * Create an interactive program to ask user for hourly wage
        * and generate yearly salary
           assume that he works 2080 hour for a year
        */

        Scanner putscan = new Scanner(System.in);
        System.out.println("What is your hourly wage : ");
        double wage = putscan.nextDouble();
       // double salaryForHour = 15;
         double salary = wage * 2080 ;
        System.out.println("Your yearly salary is  : " + salary);

    //Scanner scan = new Scanner(System.in);
    //System.out.println("What is your hourly wage : ");

        /*
        Task 5: Grocery Shopping
        * ask user whats the price of tomato and store it
          ask user how many tomato you want to buy and store it
        * ask user whats the price of potato and store it
          ask user how many tomato you want to buy and store it
        * ask user whats the price of banana and store it
          ask user how many tomato you want to buy and store it
​
              generate this example output
              You got 3 tomato price is 2.99 and total -->>
              You got 3 tomato price is 2.99 and total -->>
              You got 3 tomato price is 2.99 and total -->>
​
              Your grand total for this shopping is ????

         */

        Scanner scan3 = new Scanner (System.in);
        System.out.println("whats the price of tomato : " );
        //double priceTomato = 2.99;
        double priceTomato = scan3.nextDouble();
        System.out.println("how many tomato you want to buy : " );
        int countTomato = scan.nextInt();
        System.out.println("You got "+ countTomato+
                " pound of tomato the price is $"
                +countTomato*priceTomato);


        System.out.println( "whats the price of potato :");
        double pricePotato = scan3.nextDouble();
        System.out.println(" how many potato you want to buy :");
        int countPotato = scan3.nextInt();
        System.out.println(" You got " + countPotato+
                        " pound of potato the price is $"
                        + countPotato*pricePotato );

        System.out.println( "whats the price of banana :");
        double priceBanana = scan3.nextDouble();
        System.out.println(" how many potato you want to buy :");
        int countBanana = scan3.nextInt();
        System.out.println(" You got " + countPotato+
                " pound of banana the price is $"
                + countBanana*priceBanana );





    }


}
