package day56;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("HEllO B15 ");
    //  int num = 2.5; compiler error
        int []nums = new int [3];
        nums[0]=55;
        nums[1]=56;
        nums[2]=100;
   //     nums [3] =200; //run time error

  //      System.out.println("bye bye");//this line does not run
        
        int result =10/0;
        System.out.println("result = " + result);
    }
}
