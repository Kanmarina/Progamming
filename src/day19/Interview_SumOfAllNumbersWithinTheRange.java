package day19;

public class Interview_SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {

        //get the sum numbers from 1-10
        //it's interesting 1+2+3+4+5+6+7+8+9+10 how much is it

        //when we loop from 1 to 10
        int sum = 0; //nothing has been added yet so 0

//        sum = sum +1;
//        sum +=2;
//        sum +=3;
//        sum +=4;
//        sum +=5;
//        sum +=6;
//        sum +=7;
//        sum +=8;
//        sum +=9;
//        sum +=10;
//
//        sum = sum +i;

        for (int i = 0; i <=10  ; i++) {
            sum = sum +i;
            System.out.println(sum);
        }

    }
}
