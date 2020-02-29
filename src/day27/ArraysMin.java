package day27;

public class ArraysMin {
    public static void main(String[] args) {

        // write the program  that can find minimum number
        // without sort from int array
        int [] scores = {100,90,900,800,10,20,-1};
        int min = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if( min > scores[i]){
                min = scores[i];

            }
        }
        System.out.println("minimum number " + min);

        int secondMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]== min){
                continue;
            }
            if(secondMin> scores[i]){
                secondMin=scores[i];
            }
        }
        System.out.println(" Second min number is " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i] == min || scores[i] == secondMin){
                continue;
            }
            if(thirdMin>scores[i]){
                thirdMin=scores[i];
            }
        }
    }
}
