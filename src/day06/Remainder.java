package day06;

import java.sql.SQLOutput;

public class Remainder {
    public static void main(String[] args) {

        // + - * /

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        //5 devided by 2 is 2 and remainder is 1
        System.out.println(5 % 2);

        //10*9 + 9 =99
        System.out.println(99%10);

        //10*10 + 0 =100
        System.out.println(100%10);

         //declare a variable called minutes data type int
        //ask user to enter minutes as whole number
        //print the result in x hour y minutes format
        // for examples 135 minutes, 2 hour 15 minutes

        int min = 135; //60*2+15
        int hour = 135/60; //>>>2

        int mins = 135%60; //>>>15
        System.out.println("The minutes " + min + " is " +
                hour + " hours and " + mins + " minutes");






    }
}
