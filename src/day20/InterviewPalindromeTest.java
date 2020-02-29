package day20;

public class InterviewPalindromeTest {
    public static void main(String[] args) {

        //if you reverse a String it does not change
        // it means
        //the String is  Palindrome


        //level, kayak, madam, aziza

        String name ="kayak";

        String reversedName ="";

        for (int i = name.length()-1; i >=0; i--){
            reversedName = reversedName + name.charAt(i);
        }
        System.out.println("reversed name = "+ reversedName);

        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");
        }else{
            System.out.println("Palindrome test has failed");
        }
        //make this code does not care about
    }
}

