package day10;

public class Calculator {
    public static void main(String[] args) {

        char operator = '2';
        switch (operator){
            case '+':
                System.out.println("add numbers");
                break;
            case '-':
                System.out.println("subtract numbers");
                break;
            case '*':
                System.out.println("multiply numbers");
                break;
            case '/':
                System.out.println("divide numbers");
                break;
            default:
                System.out.println("invalid");
        }

    }

}
