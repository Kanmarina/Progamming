package day16;

import java.util.Scanner;

public class WarmTaskReverse {
    public static void main(String[] args) {
        //give a word 4 characters stored in variable word1
        //create a String variable called
        // word2 store the reversed word1 into word2 and print
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 4 character word please!");
        String word1 = scan.next();
        String word2 = "" + word1.charAt(3)+ word1.charAt(2)+ word1.charAt(1)
                + word1.charAt(0);
        System.out.println  (word2);

        //In order to reverse word, we need to take last char and
        // put in first char
        //then put the second char at 1 location before first char

         String name1 = "andrey";
        String name2 ="" + name1.charAt(5)+name1.charAt(4)+ name1.charAt(3)+
                name1.charAt(2)+name1.charAt(1)+name1.charAt(0)  ;
        
        System.out.println("name2 = " + name2);

        String name3  =""+ name2.charAt(5)+ name2.charAt(4)+name2.charAt(3)+
                name2.charAt(2)+name2.charAt(1)+name2.charAt(0);
        System.out.println("name3 = " + name3);
    } 
}
