package home_tasks;

import java.util.Scanner;

public class Repl066 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        int charCount1=word1.length();
        String word1CharIndex1 =word1. substring(0,1 );
        String word1CharIndex2 =word1.substring(1,2 );
        String word1CharIndex3 =word1.substring(2,3 );

        int charCount2=word2.length();
        String word2CharIndex1 =word2.substring(0,1 );
        String word2CharIndex2 =word2.substring(1,2 );
        String  word2CharIndex3 =word2.substring(2,3 );

        if(charCount1  == 3 &&charCount2 == 3){
            System.out.print( word1CharIndex1 +word2CharIndex1+word1CharIndex2
                    +word2CharIndex2+word1CharIndex3+ word2CharIndex3);
        }else{
            System.out.println( "cannot merge");
        }
    }
}


