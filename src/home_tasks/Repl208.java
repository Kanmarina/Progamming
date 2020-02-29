package home_tasks;

import java.util.Arrays;

public class Repl208 {
    public static void main(String[] args) {

        int [] i= new int[5];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }

    public static int[] populate(int[] r) {
        for (int i = 0; i < r.length; i++) {
            r[i] = (i + 1);
        }
        return r;

    } }