package day18;

public class ForLoop {
    public static void main(String[] args) {

        //count 1 to 5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            System.out.println("happy birthday");
        }
        for (int counter = 10; counter > 0; counter--) {
            System.out.println(counter);
        }

      //skip counting by 2
        //starting from 0-100

        for(int i =  0; i  <100; i+=2){
            System.out.print (i+ " ");
        }
        System.out.println();

        for(int i =  0; i  <100; i+=3){

            System.out.print (i+ " ");
        }

        //even number
        System.out.print ("----------------------even number");
        for (int i = 0; i <100 ; i++) {
            if(i %2==0){
                System.out.print(i+" ");
            }}

        for (int i = 0; i < 100; i++) {
            if(i %5 ==0 && i%3 ==0){
                System.out.println(i+ "is FizzBuzz number");
            }

        }
    }
}