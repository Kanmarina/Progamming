package day16;

import java.util.Scanner;

public class StringPractice_SecondWordGetter {

    public static void main(String[] args) {

        //given a sentence with 3 words
        //get the second word

        //Steps:
        //second word is between first space and last space
       // getting location of space remind me of indexOf
        //getting string inside another string by the beginning
        //and ending index
        //remind me of substring
Scanner scan = new Scanner(System.in);
        System.out.println("put sentence from 3 word");
        String sentence =  scan.nextLine();
         String secondWord ;
         int firstSpaceIndex =sentence.indexOf(" ");
        System.out.println(firstSpaceIndex);
        int secondSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println(secondSpaceIndex);

        System.out.println(sentence.substring(firstSpaceIndex,secondSpaceIndex));
       secondWord=sentence.substring(firstSpaceIndex+1,secondSpaceIndex);
        System.out.println(secondWord);

        String firstWord = sentence.substring(0,firstSpaceIndex);
        System.out.println(firstWord);

        String lastWord = sentence.substring(secondSpaceIndex);
        System.out.println(lastWord );

    }
}
