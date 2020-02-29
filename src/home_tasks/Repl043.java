package home_tasks;

import java.util.Scanner;
public class Repl043 {

public static void main(String[]args){



        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();

        //your code here
        if ("a".equals(a)){
            System.out.println("a is wrong");
        }else if ("b".equals(a)){
            System.out.println("b is correct");
        }else if ("c".equals(a)){
            System.out.println("c is wrong ");
        }else if  ("z".equals(a)) {
            System.out.println("z is not a valid answer");
        }


        }
}