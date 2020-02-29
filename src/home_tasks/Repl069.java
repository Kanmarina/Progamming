package home_tasks;

import java.util.Scanner;

public class Repl069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int charCount =word.length()/2;

        System.out.println(word.substring(0,charCount)+word.substring(0,charCount));
    }
}


