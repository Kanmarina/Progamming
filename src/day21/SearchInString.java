package day21;

public class SearchInString {
                public static void main(String[] args) {
                    String name = " Kan Marina";
                    int charCount = name.length();
                    int lastCharIndex  = charCount -1;

//     1 Char
                    //Find out index of all the letter "a" in cases insensitive manner

                    //solution: i will go through each and every letter of string >>loop
                    //while im going through each and every char
                    // i will check whether current char im looking at equals to a or A
                    // >> currentChar.equalsIgnoreCase("a)
                    // if it is I will print the index >> println
                    // if not >> just move on
                    //perform this action until I reach last char
                    //>> if i go over last char index i stop



                    for (int i =  0; i <=  lastCharIndex; i++){

                        String currentChar = name.substring(i,i+1);
                        if(currentChar.equalsIgnoreCase ("a")){
                            System.out.println( " the index of a or A is  "+i);
                        }

        }
    }
}
