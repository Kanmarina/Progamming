package office_hour;

public class Practice_01_06_Fibonacci {
    public static void main(String[] args) {

    }
    public static void fib(int num) {
        int num1 = 0;
        int num2 = 1;
        int result = 0;

        if (num == 0) {
            result = 0;
        }
        if (num == 1) {
            result = 1;
        }
        for (int i = 2; i <= num; i++) {
            result = num2 + num1;
            num1 = num2;
            num2 = result;
        }
        System.out.println(result);
    }
}
