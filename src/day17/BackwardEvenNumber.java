package day17;

public class BackwardEvenNumber {
    public static void main(String[] args) {

        int name = 100;
        while (name > 0) {
            if (name % 2 == 0) {
                System.out.println(name + " even number");
            }
            --name;
        }
    }
}