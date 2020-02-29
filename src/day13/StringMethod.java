package day13;

public class StringMethod {

    public static void main(String[] args) {
        // String actions that we already know so far

        //equals
         String s1 ="hello";
        System.out.println(s1.equals("abc"));
        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("hello"));

       //toUpperCase method of String is used to make String
        //all characters uppercase
        System.out.println(  s1 );
        System.out.println(s1.toUpperCase( ));

        //toLowerCase method of String is used to make String
        //all characters lowercase

        System.out.println(   s1.toLowerCase());

        //store your name into a variable
        //print your name in all uppercase:
           // you may optionally concatenate "My name is :Your name
        //print your name in all lowercase
           // you may optionally concatenate my name: is your name
           String s2 = "my name is: your name";
        System.out.println(s2.toUpperCase() );
        System.out.println(s2.toLowerCase() );

        //In order to get how many character we have inside String
        //we can use length metod of String
        //it will count each and every

        System.out.println(  s1.length());

        int lengthOfStr = s1.length();
         if (lengthOfStr>4){
             System.out.println("More than 4 character");
         }else{
             System.out.println("Not more than 4");
         }

    }
}
