package day022;

public class ArrayPractice {
    public static void main(String[] args) {

        double [] prices = new double[5];
        System.out.println( prices[0]);

        //can not print out array variable directly
        //to see whats in side
        System.out.println(prices);

        prices [0] = 2.46;
        prices [1] = 12.96;
        prices [2] = 500  ;
        prices [3] = 65.123;
        prices [4] = 992.1;
        //if i go over the range
        //Run time Error!!!
        //prices[5]=165.3;

        System.out.println( prices[0]);
        System.out.println( prices[1]);
        System.out.println( prices[2]);
        System.out.println( prices[3]);
        System.out.println( prices[4]);

        //create char array that  hold  letter from your name
        //assign value using each chars of your name

        char [] name = new char[6];

        //Default value do we get for char array
        //we get char represented by ascii code 0
        System.out.println("<"+name[0]+ ">");

        name[0] = 'M';
        name[1] = 'a';
        name[2] = 'r';
        name[3] = 'i';
        name[4] = 'n';
        name[5] = 'a';

        System.out.print  (name[0]);
        System.out.print  (name[1]);
        System.out.print  (name[2]);
        System.out.print  (name[3]);
        System.out.print  (name[4]);
        System.out.print  (name[5]);
        System.out.println();
        System.out.println (name);

        boolean [] bools= new boolean[3];
        System.out.println(bools[0]);
        System.out.println(bools[1]);
        System.out.println(bools[2]);

        bools[0]=true;
        bools[1]=false;
        bools[2]=10>7;

        System.out.println(bools[0]);
        System.out.println(bools[1]);
        System.out.println(bools[2]);

    }
}
