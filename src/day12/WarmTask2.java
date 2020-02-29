package day12;

import java.util.Scanner;

public class WarmTask2 {
    public static void main(String[] args) {

        /*  Wake up Task 2
        Create a class called WarmUp_SeasonFinder :
        Create a variable called month with data type int
        And write an if else if else statement to do following
        If the month is less than 1 or more than 12 —>> INVALID MONTH
        If the month is between 3-5  print it's  spring
        If the month is between 6-8  print it's  summer
        If the month is between 9-11  print it's  fall
        If the month is 12,1,2  print it's  Winter! */
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose number from 1-12");

        int month = scan.nextInt();

        if (month<1 || month>12 ){
            System.out.println("Invalid month");
        }else  if (month<=5 && month>=3){
            System.out.println("it's  spring");
        }else  if (month<=8 && month>=6){
            System.out.println("it's  summer");
        }else  if (month<=11 && month>=9){
            System.out.println("it's  fall ");
        }else  if (month==12 || month==1 || month== 2) {
            System.out.println("it's  Winter! ");
        }

    }
    }

