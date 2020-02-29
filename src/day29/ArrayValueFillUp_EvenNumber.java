package day29;

import java.util.Arrays;

public class ArrayValueFillUp_EvenNumber {
    public static void main(String[] args) {

        //create an array with size 100 and fill
        // it up  even number including 0

        int[] numbers = new int [100];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));

        for (int x = 0; x <numbers.length ; x++) {
            numbers[x] = x*2; //even number
        }
        System.out.println(Arrays.toString(numbers));

        for (int x = 0; x <numbers.length ; x++) {
            numbers[x] = (x*2)+1; //odd number
        }
        System.out.println(Arrays.toString(numbers));

   //Create an array with size 300 and fill it up with I Love Java
        String [] sentence = new String [300];
        sentence[0]= "I love Java ";
        for( int x= 0; x < sentence.length ;x++)
            sentence[x]= "I love Java ";
        System.out.println( Arrays.toString(sentence));

    }
}
