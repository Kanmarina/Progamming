package day10;

public class SeasonAction {
    public static void main(String[] args) {

        /*What do you do in each season
        * Spring >>> Hike, Easter, Nawruz, Blossom
        * Summer >>> Black Friday, Hiking, Harvest, Halloween, Shopping
        * Winter >>> Snowboarding, Ski, Christmas, New Year
         */
        String season = "hdv";
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
