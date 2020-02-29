package home_tasks;

public class REpl210_reverseWithSpecial {
    public static void main(String[] args) {
        String word = "Ab,c,de!$";
        String reversed="";
        for (int i = word.length()-1; i >=0 ; i--) {
            if(Character.isLetter(word.charAt(i)))
                reversed+=word.charAt(i);
        }
        int ct=0;
        for (int i = 0; i <word.length() ; i++) {
            if(Character.isLetter(word.charAt(i))){
                word=word.substring(0,i)+reversed.charAt(ct)+word.substring(i+1);
                ct++;
            }
        }
    }
}
