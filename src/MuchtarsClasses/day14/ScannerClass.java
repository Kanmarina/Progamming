package MuchtarsClasses.day14;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a byte value");
        byte byteNum = input.nextByte();
        System.out.println("You have entered : " + byteNum);

        System.out.println("enter a byte value 2");
        byte byteNum2 = input.nextByte();
        System.out.println("You have entered : " + byteNum2);
    }
}
