package day07;

public class CastingCharacter {

    public static void main(String[] args) {

        //with ASCLL table
        char grade = 'B';
        System.out.println(grade);

        int letterInNumber = 'B';
        //B represented by 66 in ascll table
        //here type char is automatically widened to int
        //and stored as number
        System.out.println(letterInNumber);
        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        char myFirstChar = (char)100;
        System.out.println(myFirstChar);

        int letterName1 = 'M';
        int letterName2 = 'A';
        int letterName3 = 'R';
        int letterName4 = 'I';
        int letterName5 = 'N';
        int letterName6 = 'A';
        System.out.println(letterName1+letterName2+letterName3
                +letterName4+letterName5+letterName6);

        char letterA = 'a';
        //adding a character to a int number will result in int
        //(int) letterA + 1
        System.out.println(letterA + 1);
        System.out.println(" " + letterA + 1 );






    }
}
