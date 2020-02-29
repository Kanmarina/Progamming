package day20;

public class ReverseStringLast {
    public static void main(String[] args) {

        //given a String name with value
        //reverse this name and store reversed value into
        //another String variable reversedName

        String name = "Kan Marina";
        String reversedName="";
        int lastCharIndex = name.length() -1;
//        System.out.print ( name.charAt(7));
//        System.out.print ( name.charAt(6));
//        System.out.print ( name.charAt(5));
//        System.out.print ( name.charAt(4));
//        System.out.print ( name.charAt(3));
//        System.out.print ( name.charAt(2));
//        System.out.print ( name.charAt(1));
//        System.out.print ( name.charAt(0));
//        System.out.println();
        for (int i =lastCharIndex; i >= 0 ; i--) {
            System.out.print(i + " index : ");

            char currentChar = name.charAt(i);
            System.out.println(currentChar);

            reversedName = reversedName + currentChar;
        }
            System.out.println(reversedName);

        // This is all you need:
       // for (int i =lastCharIndex; i >= 0 ; i--)
       // reversedName = reversedName + name.charAt(i);
    }
}
