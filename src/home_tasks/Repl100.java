package home_tasks;

import java.util.Scanner;

public class Repl100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int counter = 0;
        String between = str;
        while (str.contains("bread")) {
            str = str.substring(str.indexOf("bread") + 5 , str.length());
            counter++;
        }
        if (counter >= 2) {
            between = between.substring(between.indexOf("bread") + 5, between.length());

            between = between.substring(between.indexOf("bread") + 5, between.length());

            System.out.println(between);
        } else {
            System.out.println("nothing");
        }
    }

}
  /*  String str = scan.next();
    int counter = 0;
    String between = str;

if(str.indexOf("bread") != str.lastIndexOf("bread")){
    str.=str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
        System.out.println(str);

        }else{
        System.out.println("nothing");
        }   */