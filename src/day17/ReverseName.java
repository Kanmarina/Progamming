package day17;

public class ReverseName {
    public static void main(String[] args) {

        //assuming you don't know the length of your name
//  write a program to print your name in reverse order
        //             012345678
        String name = "Marina";

        //int lastCharIndex =name.length()-1;

        int x = name.length()-1;
        while ( x >= 0 ) {
            System.out.println("index "+  x + " : "+name.charAt(x));
            --x;
        }
        //find out the location of your last char
        // pick your last char of your name
        //then keep picking until first char
    }
}
