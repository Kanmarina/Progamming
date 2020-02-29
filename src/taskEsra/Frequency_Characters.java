package taskEsra;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Characters {
    //Write a return method that can find the frequency of characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static void main(String[] args) {
        String str = "AAABBCDD";
        Map<Character, Integer> charFreq = new HashMap<>();
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!charFreq.containsKey(currentChar)) {
                //   if(!charFreq.containsKey(currentChar)==false)
                System.out.println(currentChar);
                charFreq.put(currentChar, 1);

            } else {
                System.out.println(currentChar);
                charFreq.replace(currentChar, charFreq.get(currentChar) + 1);
            }


        }
        System.out.println("charFreq = " + charFreq);
    }


}

