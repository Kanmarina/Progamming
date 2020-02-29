package home_tasks;

import java.util.Scanner;

public class Repl076 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int index1 = email.indexOf("_");
        int index2 = email.indexOf("@");
        int index3 = email.indexOf(".");

        String firstName = email.substring(0, index1);
        String lastName = email.substring(index1 + 1, index2);
        String apple = email.substring(index2 + 1, index3);
        String com = email.substring(index3 + 1);
     String  firstName1= email.substring(0,1 ).toUpperCase( )+email.substring(1, index1);
     String  firstName2= email.substring(index1 + 1 ).toUpperCase( )+email.substring(index1 + 2, index2);
          System.out.println("First name: "+  firstName1  );
    }             
}