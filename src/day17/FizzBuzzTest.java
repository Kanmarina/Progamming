package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {

        //if number can be divided by both 3 and 5 > fizzbuzz number
        //if number can be divided by     5 > fizz  number
        //if number can be divided by   3    >  buzz number

        int num  = 1;
        while (num <= 50){
            if(num %5==0 && num %3==0){
                System.out.println(num +" is Fizz Buzz number");
            }else if (num %5==0){
                System.out.println(num +" is Fizz number");
            }else if (num %3==0) {
                System.out.println(num + " is Buzz number");
            }
            ++num;
        }
    }
}
