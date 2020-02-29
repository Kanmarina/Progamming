package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingCharacterShowedAtLeastOnce {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        //How many unique character showed up in above sentence

        //first create a HashSet object with type Character
        //iterate over each charecter in above String
        //then added it to the object (HashSet) so it can remove to dublicate for us

    //    Set<Character>chars = new HashSet<>(Arrays.asList('A','A','A','A','A' ));

        Set<Character>chars = new HashSet<>(Arrays.asList(new Character[]{'A','A','A','A','A'}));
        System.out.println("chars = " + chars);

String [] eachCharStrArray = str.split("");
        System.out.println("eachCharStrArray = " + Arrays.toString(eachCharStrArray));

        List<String>charLst =Arrays.asList(eachCharStrArray);
        Set<String>charSet = new HashSet<>(charLst);
        System.out.println("charSet = " + charSet);

        //the one shot

        Set<String>charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("charSetShortWay = " + charSetShortWay);
    }
}
