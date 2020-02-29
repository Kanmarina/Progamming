package day40;

import java.util.ArrayList;

public class HotMarketActions {
    public static void main(String[] args) {

        Offer offer1= new Offer();
        offer1.company = "Apple";
        offer1.location= "Austin";
        offer1.isFullTime = true;
        offer1.salary = 140000;
        offer1.displayInformation();

        Offer offer2 = new Offer();
        offer2.location = "Boston";
        offer2.company =  "Google";
        offer2.salary = 100000;
        offer2.isFullTime = true;
        offer2.displayInformation();

        Offer offer3= new Offer();
        offer3.company = "Amazon";
        offer3.location= "Vancouver";
        offer3.isFullTime  = true;
        offer3.salary = 96000;
        offer3.displayInformation();

        Offer offer4= new Offer();
        //if we don't assign values to instance field|variable
        //we get default value
        //for primitive numbers: 0 or 0.0
        ////boolean: false
        //char : ''
        //for any reference types:
        // null

        offer4.displayInformation();

        ArrayList<Offer>myOffers = new ArrayList<>();
        myOffers.add(offer1);
        myOffers.add(offer2);
        myOffers.add(offer3);
        myOffers.add(offer4);
        System.out.println("myOffers ========================== " ) ;

        for(Offer each : myOffers){
            each.displayInformation();
        }
        System.out.println("my offers =================for loop=============== ");

        for (int i = 0; i <myOffers.size() ; i++) {
            //store each item to a variable each
            Offer each = myOffers.get(i);
            each.displayInformation();
           //this is the one shot version
         //   myOffers.get(i).displayInformation();
        }
    }
}
