package MuchtarsClasses.day09;

public class Ternary_Condition {
    public static void main(String[] args) {
        int num =0;
        num = (false)?100 : 50;
        System.out.println(num);

        byte gradev=60;
        boolean Passed = gradev > 60 ? true :false;
        System.out.println(Passed);

//        String Group ="";
//        char FinalGrade ;
//        Group = (FinalGrade == 'A')? "Early Birds"
//                :  (FinalGrade == 'B')? "Group 1"
//                : (FinalGrade == 'C')? "Group 2 ":" Group";
//
        int score =65;
        char Finals =' ';

        Finals = (score>=90 && score <=100)? 'A'
                : (score>=80  )? 'B'
                :(score>=70  )? 'C'
                :(score>=60  )? 'D': ' ';
        System.out.println(Finals);
    }
}
