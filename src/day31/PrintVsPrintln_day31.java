package day31;

public class PrintVsPrintln_day31 {
//Create a method called print 7 line of hello and call it sayHelloWorld7Times

    public static void main(String[] args) {
        sayHelloWorld7Times();
        sayHelloWorld3Times();
        sayHelloWorld4Times();
        System.out.println("__________________");
        PrintVsPrintln_day31.sayHelloWorld7Times();
        Marina();
        System.out.println("__________________");
        calculateMathProblem();
    }

  public static void  sayHelloWorld7Times(){

        //piece of code that you want to resume goes here
      System.out.println("Hello world line 1 ");
      System.out.println("Hello world line 2 ");
      System.out.println("Hello world line 3 ");

      System.out.print("Hello world line 4 ");
      System.out.print("Hello world line 5 ");

      System.out.println("Hello world line 6 ");
      System.out.println("Hello world line 7 ");

  }
    public static void  sayHelloWorld3Times() {
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
    }
    public static void  sayHelloWorld4Times(){
        System.out.println("Hello world line 4 ");
        System.out.println("Hello world line 5 ");
    }
    public static void  Marina(){
        System.out.println("Marina you can do it");
    }
  /*  int num1 = 5;
    double num2 = 3.0d;
    float num3 = 3.0f;
    double result1 = num1 + num2;
    double result2 = num1 - num2;
    double result3 = num1 * num2;
    double result4 = num1 / num2;
    float result5 = num1 / num3;
System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
System.out.println(result4);
System.out.println(result5);
    Create a method to take above action , call it calculateMathProblem()*/

  public static void calculateMathProblem(){

      int num1 = 5;
      double num2 = 3.0d;
      float num3 = 3.0f;
      double result1 = num1 + num2;
      double result2 = num1 - num2;
      double result3 = num1 * num2;
      double result4 = num1 / num2;
      float result5 = num1 / num3;
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
      System.out.println(result5);
  }
}
