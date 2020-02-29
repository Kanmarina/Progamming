package day08;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        //sudo code ( pseudo)
        /*
         *given your currentSpeed, speedLimit
         *
         * check whether the current speed is
         *
         * more than 90 >> jail
         * more than 80 and less than 90 >>reckless driving
         * more than 70 and less 80 >> point taken
         * more than 60 and less than 70 >>warning
         *
         *
         * >>>>>>start from here two optional
         *  more than 70   >> point taken
         * more than 60 and less than 70 >>warning
         *
         * elseif not speeding keep driving

         */
   /*  int currentSpeed = 65;

     if (currentSpeed >70 ) {
         System.out.println("you are speeding more than 70 "   +
                 ">> points taken ");
     // asking whether its less than or equal 70 and more than 60
         //when you come to this point, your speed is
         // already not more than 70
     }else if(currentSpeed>60 ) {
         System.out.println("your speed is less than 70 but more than 60");
     }else{
         System.out.println("keep driving");*/


        int currentSpeed = 100;

        if (currentSpeed > 90) {
            System.out.println(" go to jail ");
        } else if (currentSpeed >= 80) {
            System.out.println("reckless driving");
        } else if (currentSpeed > 70) {
            System.out.println(" point taken");
        } else if (currentSpeed > 60) {
            System.out.println(" warning ");
        }else
        System.out.println("keep driving");


    }

}