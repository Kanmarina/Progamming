package day11;

public class ScoreChecker {
    public static void main(String[] args) {

        int score = 70  ;
        if (score < 0 || score> 100){
            System.out.println("Invalid score!!!");
        }else if( score == 100){
            System.out.println("Perfect score!!!");
        }else if( score> 70 &&  score <100) {
            System.out.println("You have passed!!!");
        }    else {
            System.out.println("You have failed!!");
        }

    }
}
