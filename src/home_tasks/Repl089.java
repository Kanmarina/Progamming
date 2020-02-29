package home_tasks;

public class Repl089 {
    public static void main(String[] args) {

        String word =  "marai";
        //WRITE YOUR CODE HERE

        String firstChar= word.substring(0,1);
        String lastChar = word.substring(word.length()-1 );
        System.out.println(firstChar+lastChar);

    }
}
