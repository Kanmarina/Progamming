package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static <Sacnner> void main(String[] args) {
        /*What do you do in each season
         * Spring >>> Hike, Easter, Nawruz, Blossom
         * Summer >>> Black Friday, Hiking, Harvest, Halloween, Shopping
         * Winter >>> Snowboarding, Ski, Christmas, New Year
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the season ?/?");
        String season = scan.next();
        switch(season){
            case "Spring":
                System.out.println("Hike, Easter, Nawruz, Blossom");
                break;

            case "Summer":
                System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest");
                break;

            case "Winter":
                System.out.println("Snowboarding, Ski, Christmas, New Year");
                break;
        }

    }

}




