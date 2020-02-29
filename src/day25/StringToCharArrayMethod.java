package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name = "Alesya";
        //how would you store each and every char
        //to an char array from above name
        //without using method
        char [] namesChars = new char[name.length()];

        //namesChars[0]=name.charAt(0);
        for (int x = 0; x <namesChars.length ; x++) {
            //take each char of name and fill the char array values
            namesChars[x]=name.charAt(x);
        }
        System.out.println("name Chars = "+ Arrays.toString(namesChars));

        char [] namesChars2 = name.toCharArray();
        System.out.println((Arrays.toString(namesChars2)));

         // pick up your own name and turn in into char array
        // and use for each loop to loop over them
       // optionally count how many a you have in your name

        String name1 = "Marina";
        char[] names = name1.toCharArray();
      //  for (int x = 0; x <names.length ; x++) {
        //    names[x]=name1.charAt(x) ;
        for (char eachCahr:names) {
            System.out.println ("each char : " + eachCahr);
        }
          //  System.out.print (Arrays.toString(names ));

        //count how many a we have
        int count = 0;
        for (char eachCahr:names) {
            System.out.println ("each char : " + eachCahr);
          if (eachCahr=='a'){
              ++count;
          }
        }
        System.out.println(count);
        }



    }

