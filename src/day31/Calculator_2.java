package day31;

public class Calculator_2 {
    public static void main(String[] args) {

    //    char operator='+';
      //  int num1=15;
        //int num2=3;
        calculate('-',30,20);
        calculate('+',20,10);
        calculate('*',40,20);
        calculate('/',40,2);
        calculate('f',40,2);
    }
    public static void calculate(char operator, int num1,int num2){
        switch (operator){
            case '+':
                System.out.println("Addition result is "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction result is "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication result is "+(num1*num2));
                break;
            case '/':
                System.out.println("Division result is "+(num1/num2));
                break;
            default:
                System.out.println("invalid");
        }

    }
}
