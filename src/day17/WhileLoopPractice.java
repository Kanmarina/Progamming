package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {

        //count 1 to 5 then 5 to 1

        int count = 1;
        while(count <=5){
            System.out.print(count +" ");
            ++count;
        }
        System.out.println();
        System.out.println("count = "+count);//at this point count 6
        //now from 5 to 1
        // 6>=1 5>=1 4>=1 3>=1 2>=1 1>=1 true; 0>=1 false you get out
        // 6> 1 5> 1 4> 1 3> 1 2> 1   true; 1> 1 false you get out
        while(count> 1){
            --count;
            System.out.print (count +" ");
        }
    }
}
