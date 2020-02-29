package day25;


import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {

        String sentence = "I have dream job at 1st of June";
        // WHAT DOES IT DO ?
        // split(bysomething) is a method of String that split string into multiple part
        // DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD ?
        // Yes, we need to tell what do we use while splitting(fe space)
        // WHAT DO I GET OUT OF IT ?
        // we get out String Array

       String[] allWords =  sentence.split(" ");
        System.out.println( "all words " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence ? : "+
                allWords.length);

        //how do I get the last word of the sentence using array i got from string
        System.out.println("Last word in this sentence is: "+ allWords [allWords.length-1]);

        //are we limited to split by space or we can split by anything? > Anything

        String sentence2 = "Everything is awesome";
        //split by letter e

        String[] split = sentence2.split("e");
        System.out.println(Arrays.toString(split));

        for(String eachPieces : split) {
            System.out.println("each piece = " + eachPieces);
        }
            String sentence3 = "I love my family";
            String [] splitMy = sentence3.split(" ");
            System.out.println(Arrays.toString(splitMy));

            String longestWord =allWords[0];
            int maxCharCount = 0;
            //First create a string variable longstWord to store my result
        //also create maxXharXount variable to store my longest char count
            //I want to go through each and every words in String Array
        //and check wether the length of current word is more than longestWord
        //if it is I will assighn the longest word value to current word im looking at

        for(String currentWord : allWords){
            if(currentWord.length() > longestWord.length()){
                longestWord = currentWord;
            }
        }
        System.out.println(" longest word = "+ longestWord);
        }}



