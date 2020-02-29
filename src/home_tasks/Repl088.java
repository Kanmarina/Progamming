package home_tasks;

import java.util.Scanner;

public class Repl088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i=0; i<word.length();i++){
            if(word.charAt (i) == 'c'){
                if(word.charAt (i+1) == 'a' && word.charAt (i+2) == 't'){
                    countOfCats++;
                    i+=2;
                }
            }
        }
        for (int i=0; i<word.length();i++){
            if(word.charAt (i) == 'd'){
                if(word.charAt (i+1) == 'o' && word.charAt (i+2) == 'g'){
                    countOfDogs++;
                    i+=2;

                }
            }

        }
        System.out.println(countOfCats==countOfDogs);

    }
}
