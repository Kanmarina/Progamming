package day40;

import java.util.ArrayList;

public class HotMarketActions2 {
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
        offer4.displayInformation();


        //Add 2K to the Amazon offer
         //offer3.salary = 96000+2000;
        offer3.salary=offer3.salary +2000;
         offer3.salary += 2000;
        System.out.println("new offer3.salary = " + offer3.salary);

        //set the salary value of offer4 object to sum of all the offers

        offer4.salary=offer1.salary + offer2.salary + offer3.salary;
        offer4.displayInformation();
        offer4.turnToFullTime();
        offer4.turnToFullTime();
        offer4.displayInformation();
        offer4.changeLocation("DC");
        offer4.displayInformation();
    }
}
