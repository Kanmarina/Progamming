package office_hour;

public class Practice_01_06_Palindrome {
    public static void main(String[] args) {

    }
    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        int reversedNumber = 0;
        int originalNumber = num;
        while (num > 0) {
            // 12 % 10 = 2
            // 125 % 10 = 5
            // 3 % 10 = 3
            int last_digit = num % 10;
            // 5 + 4 = 9
            // 5 * 10 + 4 = 54
            // 54 * 10  + 3 = 543
            reversedNumber = reversedNumber * 10 + last_digit;
            //once we retrieved and added last digit to the reversedNumber variable
            //we can get rid off that digit
            // 54 / 10 = 5
            // 1001 / 10 = 100
            // 100 / 10 = 10
            // 10 / 10 = 1
            // 1/10 = 0, according to java
            num = num / 10;
        }
        System.out.println(reversedNumber == originalNumber);
    }

}
