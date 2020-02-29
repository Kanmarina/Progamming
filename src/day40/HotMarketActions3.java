package day40;

import java.util.ArrayList;

public class HotMarketActions3 {
    public static void main(String[] args) {

        Offer offer1= new Offer();
        offer1.company = "Apple";
        offer1.location= "Austin";
        offer1.isFullTime = true;
        offer1.salary = 140000;
        offer1.displayInformation();


        offer1.displayInformation();
        offer1.turnToFullTime();
        offer1.turnToFullTime();
        offer1.displayInformation();
        offer1.changeLocation("DC");
        offer1.displayInformation();

offer1.changeAllInfo("Amazon","Virginia",200000,true);
           //offer1.displayInformation();
          //if the guy earn more than 100K
        //move him to Atlanta
        System.out.println("Is it 100K offer? "+ offer1.is100KOffer());
    //    boolean result = offer1.is100KOffer();
        if (offer1.is100KOffer()){
            offer1.changeLocation("Atlanta");
        }
        offer1.displayInformation();

    }


    }

