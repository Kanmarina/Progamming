package day36;

public class MethodWithParameter {
    public static void main(String[] args) {
        addOneHundred(25);
        addOneHundred(new Integer(100));
        int num = 7;
        addOneHundred(num);
        addOneHundred(25);

        int num1 = 10;
        addOneHundred(num1);
        System.out.println(num1);
    }

    /*
    this is what happen at run time when you pass 25
    public static void addOneHundred(int x){
    int x =25;
        System.out.println(x +100);

     */

    // public static void addOneHundred(int x){
    //    System.out.println(x +100);

//this is what happen when we pass num to a method
//       public static void addOneHundred(int x) {
//       x will copy whatever is inside num and assign it to num
//       int x = num; int x =10;
//       x=x+100; // if you change the value of x, does it change value of num
//       System.out.println(x);

    public static void addOneHundred(int x) {
        x = x + 100;
        System.out.println(x);
    }
}