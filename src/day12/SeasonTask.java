package day12;

import java.util.Scanner;

public class SeasonTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your season please");
        String season = scan.next();
        if (season.equalsIgnoreCase("Spring")) {
            System.out.println(" Hiking, Nowuruz, cool weather");
        }else if (season.equalsIgnoreCase("Summer")){
            System.out.println(" Pool, Swimming, Beach, Vacation");
        }else if (season.equalsIgnoreCase("Fall")){
            System.out.println(" Barbecue, Riding bike, Code");
        }else if (season.equalsIgnoreCase("Winter")) {
            System.out.println(" Ski, Snowman, Sledding");
        }else{
            System.out.println("Write season correct");
        }
    }
}
