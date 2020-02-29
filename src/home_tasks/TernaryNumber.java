package home_tasks;

public class TernaryNumber {
    public static void main(String[] args) {

        int score=120;
        char grade =(score>60) ? 'F':'Z';
        System.out.println(grade);

        String result = (score>50)? "pass" : "fail";
        System.out.println(result);

        String evenOdd = (score%2==0) ? "even" : "odd";
        System.out.println(evenOdd);
    }
}
