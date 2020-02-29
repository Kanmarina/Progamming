package home_tasks;

import java.util.ArrayList;

public class Repl195 {
    public static void main(String[] args) {

        ArrayList<Integer>lst = new ArrayList<>();
        lst.add(5);
        lst.add(8);
        lst.add(3);

        int sum = 0;
        for( int i =0; i<lst.size(); i++){
            sum += lst.get(i); // sum = sum+lst.get(i);


        }
        System.out.println(sum);

    }
}
