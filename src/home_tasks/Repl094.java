package home_tasks;

import java.util.Scanner;

public class Repl094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;
        boolean condition =true;

        while(condition){
            System.out.println("Enter Item"+count+ "and its price:" );
            item=scan.next();
            price= scan.nextDouble();
            shoppingListReport+= ("Item"+count+": "+item+" Price: "+price);
            totalProce+=price;
            System.out.println("Add one more item?");
            countinue = scan.next();

            if(!countinue.equals("yes")){
                System.out.println(shoppingListReport);
                System.out.println("Total price: " +totalProce);
                condition=false;
            }
            count++;
            shoppingListReport+=", ";
        }
    }
}
