package day21;

public class DecideWhentoStop {
    public static void main(String[] args) {

        String msg = "Hello World";

        int charCount = msg.length();
        int countOfCharToIterate = 2;

        for (int x = 0; x <=charCount-2 ; x++) {
            System.out.println((msg.substring(x,x+3)));
        }
    }
}
