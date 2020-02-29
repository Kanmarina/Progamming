package day12;

import java.util.Scanner;

public class WarmTask3 {
    public static void main(String[] args) {

        /*// TASK 3 :
Create a class called FizzBuzzNumberCheck with main method
Given a number  , create a variable int num
   If this number can be divided by 5 without remainder  lets print  it Fizz number
          For example.  5 , 15 , 25 , 100
   If this number can be divided by 3 without remainder  lets print  it Buzz number
          For example.  3 , 15 , 9 , 27
  If this number can be divided by both 3 and 5  lets print FizzBuzz Number
         For example.   15 , 45 , 30 , 90
 If no match , just say  NOT MY NUMBER !!!!!!!*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Put your number");
        int number =scan.nextInt();
        if (number %5==0 && number %3==0 ){
            System.out.println("FizzBuzz number");
        }else  if (number %5==0 ){
            System.out.println("Buzz number");
        }else  if (  number %3==0){
            System.out.println("Fizz  number");
        }else{
            System.out.println("Not my number ");
        }



    }
}
