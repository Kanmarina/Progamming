package day23;

public class WarmUp {
    public static void main(String[] args) {

        int[] items = {21, 32, 51, 4, 1, 5, 2};

        int lastItem = items.length - 1;
        System.out.println(items[lastItem]);
        System.out.println("---------------");

        int middle = items.length/2;
        System.out.println(items[middle]);
        System.out.println("---------------");


        for (int i = items.length - 1; i >= 0; i--) {
            System.out.println(items[i]);

int max = items[0];
if (items[i]>max){
    System.out.println(items[i]);
}
            }
        }
    }