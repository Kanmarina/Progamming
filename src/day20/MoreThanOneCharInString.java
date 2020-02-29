package day20;

public class MoreThanOneCharInString {
    public static void main(String[] args) {

        //given a String with even number char count
        //print 2 char-s in one Line
        // for example : Marina
        /* Ma 01
         *  ri 23
         *  na 45
         */
   /*   String name = "Marinana";

        int charCount = name.length();
        System.out.println( name.substring(0,2));
        System.out.println( name.substring(2,4));
        System.out.println( name.substring(4,6));
        System.out.println( name.substring(6,8)) ;

        int x =0;
        System.out.println( name.substring(x,x+2));
        x=x+2;
        System.out.println( name.substring(x,x+2));
        x=x+2;
        System.out.println( name.substring(x,x+2));
        x=x+2;
        System.out.println( name.substring(x,x+2));
        x=x+2;


        //my condition is x<=charCount-2 (cause from 2 char jumping)
        String name = "Marinana";
        int charCount = name.length();
        for(int x=0; x<=charCount-2; x+=2){
            System.out.println(name.substring(x,x+2));
        }*/
        // the same way
        String name = "Marinana";
        int charCount = name.length();
        int lastCharindex = charCount - 1;
        for (int x = 0; x <= lastCharindex - 1; x += 2) {
            System.out.println(name.substring(x, x + 2));


        }
    }
}