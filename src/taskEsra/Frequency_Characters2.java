package taskEsra;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Characters2 {
    //Write a return method that can find the frequency of characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result ="";
        int i =0;
        while(i<str.length()){
            int count =0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            result += str.charAt(i)+""+count;
            str = str.replace(""+str.charAt(i),"");


        }
        System.out.println ( result);

    }
}
