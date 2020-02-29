package day05;

public class VariablePractice {
    public static void main(String[] args) {

        // 8 primitive
        //line1
        //line2
        //line3

        // Block comment, everything in between will be seen as comment
        /*
        line1
         line2
         line3

         whole number: byte, short, int, long
         fractional number : float, double
         logical : boolean
         character : char

         Usually by default for whole numbers : just use int
         usually by default for fractional numbers : just use double

         IS String part of primitive types?  NOOO!!!
         STRING is sequence of character

        */


// Task 1: age calculator
        //given birth year, please calculate the age


            int birthYear = 2001;
            int currentYear = 2019;
            int age = currentYear - birthYear;

            System.out.println("I was born in " + birthYear + ", " +
                    "and I am a " + (2019-2001) + " years old .");

            System.out.println("I was born in " + birthYear +
                ", and I am a " + age + " years old .");

            int speedLimit = 65;
            int overTheLimit = 10;
            int currentLimit = speedLimit + overTheLimit;



            System.out.println("My current speed limit is " + currentLimit);


    }
}
