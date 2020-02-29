package day32;

public class CharsAction {
    public static void main(String[] args) {
        printAtoZ();
        printZtoA();
        printAlphabetInRange('a','m');
        printAlphabetInRange('z','A');
        printAlphabetInRange('A','A');

    }

    //printAtoZ
    //* create a method that has no parameter
    //	and print A-Z in one line
    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printZtoA() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAlphabetInRange(char beginning, char ending){
        if (beginning<ending){
            System.out.println("increment");
            for(char i =beginning;i<=ending;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }else if (beginning>ending){
            System.out.println("decrement");
            for (char i = beginning; i >=ending ; i--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }else{
            System.out.println("same");
        }
    }

}