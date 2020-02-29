package office_hour.practice_01_13;

public class Person {

    private String firstName;
     private String lastName;
     private String DOB;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }

    public void printInfo(){
       System.out.println(String.format("String first name =%s, last name =%s, date of birth =%s",firstName,lastName,DOB));


     }
}
