package MuchtarsClasses.day09;

public class Nested_IfStatement {
    public static void main(String[] args) {

        int grade =65;
        if (grade>=60 && grade <=100){
            System.out.println("passed");
            if(grade>=90 && grade<=100){
                System.out.println("with A");
            }else if(grade>=80 && grade<90){
                System.out.println("with B");
            }else if(grade>=70 && grade<80) {
                System.out.println("with C");
            }else{ //60<= grade<70
                System.out.println("with D");
            }
        }else{ //less than 60 or greater 100
            if (grade<60){
                System.out.println("failed with f");
            }else {
                System.out.println("invalid score");
            }
        }
    }

}
