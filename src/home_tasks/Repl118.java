package home_tasks;

public class Repl118 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};
        for (int i=0;i<6;i++) {
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below


        for (int i =0 ;i<=  arr.length-1;i++) {
            System.out.println(arr[i] + ", " +  arr[i+1]    + ", " +  arr[i+2]  );

        }
    }
}
