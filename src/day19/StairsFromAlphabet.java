package day19;

import java.util.Scanner;

public class StairsFromAlphabet {
    public static void main(String[] args) {

    /*  String line = "";

        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {

            line += iChar;
            System.out.println(line);

        }*/

        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner (System.in);

        digit1=scan.nextInt();
        digit2=scan.nextInt();
        digit3=scan.nextInt();
        digit4=scan.nextInt();
        digit5=scan.nextInt();

        System.out.println(" Enter your number:"  );
        int [] digits={digit1,digit2,digit3,digit4,digit5};

            for(int x: digits){
            System.out.println (x);
        }
    }
         }



