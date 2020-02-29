package day20;

public class FindingDogInSentence {
    public static void main(String[] args) {

        //given the sentence, find out location of the dog
        //out approach is
        //doing through the sentence 3 char at a time
        //then if 3 char happen to be a dog, we print out
        String msg = "I like Dog, Dog is cute, Dog is a friend";
        int lastCharIndex = msg.length()-1;
        for( int x =0; x <= lastCharIndex; x++){
            System.out.println(msg.substring(x,x+3));


        }
    }
}
