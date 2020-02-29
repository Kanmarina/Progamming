package day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
        //             012345678
        String name = "Alexander";

       //get each and every char and print them out vertically
         int x=0;
//        while (x < name.length()) {
//
//            System.out.print("index" + x + " : ");
//            System.out.println( name.charAt(x));
//            ++x;
//        }
        //assuming you don't know the length of your name
//  write a program to print your name in reverse order

        while (x >= name.length()-1) {
            System.out.println(name.charAt(x) );
            --x;
        }
    }
}
