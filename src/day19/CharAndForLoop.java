package day19;

import java.sql.SQLOutput;

public class CharAndForLoop {
    public static void main(String[] args) {

        // each char has it's corresponding ASCII value
        //from ASCII table

        int x = 'A';   //65
        char myChar = 100; //d

        System.out.println(x);
        System.out.println(myChar);

        System.out.println(++myChar); //e
        System.out.println(++myChar);//f
        System.out.println(++myChar);//g
        System.out.println(++myChar);//h
        System.out.println(++myChar);//i

        // CHARACTERS
        char myChar1 = 'A'; //65
        System.out.println(++myChar1); //B =65+1
        System.out.println(++myChar1);//C =66+1
        System.out.println(++myChar1);//D
        System.out.println(++myChar1);//E
        System.out.println(++myChar1);//F


        System.out.println('A'>'B');  //false
        System.out.println('Z'>'B');  //true


        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print (iChar +" ");
        } // A B C D ... Z

        System.out.println();

        for(char kChar ='Z'; kChar >= 'A'; kChar--){
        System.out.print (kChar + " ");
    }     //Z ...A


}}