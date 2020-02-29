package day07;

public class PreIncreamentAndPostIncreament {
    public static void main(String[] args) {

        //Int Score = 10;

        //Increament and Decreament operator ++ -- has two version
        //Pre-increament ++score
        //Post increament score++

        //Pre-increament --score
        //Post increament score--

        int apple = 8;
        apple++; //incrementing by one
        //printing the increase value
        System.out.println(apple);
        //increasing the value and print the value
        System.out.println(++apple);
        //Its called post increament
        //It will increase the value
        //but it will reflect the increased the value
        // next time the variable show up!!
        System.out.println( apple++);
        System.out.println(apple);

    }
}
