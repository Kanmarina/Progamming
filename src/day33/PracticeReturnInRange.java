package day33;

public class PracticeReturnInRange {
    //calculateAndReturnAge
    //Write a method accept a birth year and return the age :
    //the birth year should be within the range of 1900-2020
    //if not return 0
    //
    //
    //
    //
    //
    //optionally : test your code against array of birthYears
    //{1999,122,2019, 1987, 1978,1964,3999, 2004}
    public static void main(String[] args) {
        System.out.println(returnAge(1978));

    }

    public static int returnAge(int age) {
        if (age <= 1900 || age >= 2020) {
            return 0;
        } else  {
            return 2019-age;
        }
    }
}


