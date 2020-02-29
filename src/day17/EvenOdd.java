package day17;

public class EvenOdd {
    public static void main(String[] args) {


        //write a programm to print out a even number from 0 to 50
        //write a programm to print out a odd number from 0 to 50

        int number = 0;
        while (number <= 50) {
            System.out.print(number + " ");
            number += 2;// number=number+2
        }
            System.out.println("_________________");

            int number1 =1;
            while (number1 <= 50) {

                System.out.print(number1 +" ");
                number1 +=2;
            }
        System.out.println("_________________");

        int number2  =0;
        while (number2 <= 50) {
            if (number2 % 2 == 0) {
                System.out.println(number2 + " is even number");
            } else {
                System.out.println(number2 + " is odd number");
            }
            ++number2;
        }

        }
    }
