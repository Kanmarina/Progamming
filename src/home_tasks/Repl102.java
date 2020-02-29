package home_tasks;

import java.util.Scanner;

public class Repl102 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        int index1 =html.indexOf("\"");
        int index2 =html.indexOf("\"");
        String word = html.substring(index1+1 ,index2-1 );
        System.out.print(word);
    }
}
