package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable
    public void displayInformation() {

        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);

    }

    //write a method called
    public void turnToFullTime() {
        if (isFullTime == false) {
            isFullTime = true;
        }

    }

    public void changeLocation(String newLocation) {
        location = newLocation;
    }

    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime) {
        company = newCompany;
        salary = newSalary;
        location = newLocation;
        isFullTime = newIsFullTime;
//an instance method can call another instance method

        displayInformation();
    }
    //write a method to check the offer belong to 100K club and return true or false

    /**
     * a method to check the offer belong to 100K club
     * @return true or false
     */
    public boolean is100KOffer(){
      return  salary >=100000;
    }

    public String toString(){

        return "Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime  ;
    }
}