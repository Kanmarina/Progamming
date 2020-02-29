package day022;

public class LoopContinueBreak {
    public static void main(String[] args) {
//        Store this sentence in a variable msg
//        I struggle with Java I Like Java I love Java Everything is Awesome!
//                loop through each and every letter
//        1, print every other letter
//        meaning : skip a letter each time you go through the letter
//        0123456789
//        I struggle with  -->> Isrgl ih
//        USE CONTINUE FOR THIS TASK
//        2,  when you reach letter a break the loop
//                OTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitve

        String name = "I struggle with Java I like Java I love Java Everything is awesome";
        int charCount = name.length();
        int lastChar = charCount - 1;

        for (int i = 0; i <= lastChar; i++) {
            String currentChar = name.substring(i, i + 1);
            if (i % 2 == 1) {
                continue;
            }
            if (currentChar.equalsIgnoreCase("J")){
                break;
            }
            System.out.print(currentChar + " ");

        }
       // for (int i = 0; i <charCount ; i++) {
        //    String currentChar = name.substring(i, i + 1);
          //  if (currentChar.equalsIgnoreCase("a")){
            //    break;
            //}
            //System.out.println(currentChar);
        }
    }


