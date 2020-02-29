package day63;

import day12.SeasonTask;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindingUnique {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        //How many unique character showed up in above sentence

        // Basically we are looking for all the non-repeating character to make up this sentense

        // ONE WAY TO DO IT
        //first create a HashSet object with type Character
        //iterate over each charecter in above String
        //then added it to the object (HashSet) so it can remove to dublicate for us

        Set<Character>charSet = new HashSet<>();
    //    Set<Character>charSet = new TreeSet<>();
        for(int x=0; x<str.length();x++){
            charSet.add(str.charAt(x));
        }
        System.out.println("How many char overall ?"+str.length());
        System.out.println("How many unique charecters ?"+ charSet.size());
        System.out.println("charSet = " + charSet);


        for( Character eachChar : charSet){
            System.out.println("each unique Char = " + eachChar);
        }
    }
}
