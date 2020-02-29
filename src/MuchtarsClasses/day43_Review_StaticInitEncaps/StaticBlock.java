package MuchtarsClasses.day43_Review_StaticInitEncaps;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {
    static String [] arr = new String[3];
    static ArrayList<String>list =new ArrayList<>();

    static {
        System.out.println("static block");
        arr[2]="Alla";
        arr[0]="Katerina";
        arr[1]="Ruslan";
        list.addAll((Arrays.asList(arr)));
    }
    public static void main(String[] args) {
        System.out.println("main method");

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
