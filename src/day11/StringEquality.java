package day11;

public class StringEquality {
    public static void main(String[] args) {
  /*      String name = "Rabia"; //String literal

        String name2 = new String( "Rabia");
        String name3 = "Rabia";
        System.out.println(name);
        System.out.println(name2);

        System.out.println(name == name2);
        System.out.println(name == name3);

        //The correct way of comparing String to get consist result is
        //using one of the String object behavior / method
        // called equals method
        //str1.equals(str2)

        System.out.println( name.equals( name2));
        System.out.println( name.equals( name3));*/

        System.out.println("Java".equals("java"));

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");

        System.out.println(myStr == yourStr);
        System.out.println(myStr.equals(yourStr));

        if (myStr.equals("Java")) {
            System.out.println("Correct word");
        } else {
            System.out.println("Say Java");
        }



    }
}

