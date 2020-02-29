package day11;

public class LogicalOperators {
    public static void main(String[] args) {
        //combining multiple condition together
        //
        //in java there is no range check directly like math
        //for example int x=70
        //in math : 60 < x < 100  >>> true <100
        // in java: x > 60 && x <100

        // && 2amprersand & 1ampersanf >>> Logical AND operator
            // This is used to check both conditions are true at the same time

  /*            true      true
   * int x=70 ; x > 60 && x <100 ;true
  *              false     true
  * int x=10;  x > 60 && x <100; false
  *               true      false
   * int x=110;  x > 60 && x <100; false
   *
   *          true     true
   * int x=80;  x > 60 && x <100; true
  *
   */
   // Think about login example
        // only when your username is right and your password is right at the same time
        //// then you will be able to login


        // 2 pipe or 1 pipe is used for compiling conditions :
        // Logical OR operator

        // If you have  2 condition to check
        //When will this be true: As long as one side is true,
        // whole result will be true
        //Think about buying milk from 2 stores:
        //As long as you found the milk in one store, you got the milk
        //then you get out

        //As long as one side is true whole result will be true
        /*           true     false
        * int x =70; x>10 || x < 5 >>> true
        *            false    false
        * int x =7 ; x>10 || x < 5 >>>  false
        *            true   false
        * int x =17 ; x>10 || x < 5 >>> true
        *           false    true
        * int x =-8; x>10 || x < 5 >>> true

         */

        System.out.println("Truth table &&");
        System.out.println("result of true && true " +(true && true));
        System.out.println("result of false && true " + (false && true));
        System.out.println("result of true && false " + (true && false));
        System.out.println("result of false && false " + (false && false));

      /*  System.out.println (true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println (false && false);     */
        System.out.println("Truth table ||");
        System.out.println("result of true || true " +(true || true) );
        System.out.println("result of false || true " + (false || true));
        System.out.println("result of true || false " + (true || false));
        System.out.println("result of false ||false " + (false || false));

    //Create a variable called num with type int
        //find out whether number is more than 100 or less than 10

        // find out the number is within the range of 10-60
        //Print out result
        int x= 55; //x > 100 || x<10
        System.out.println(x > 100 || x<10);
        System.out.println(x > 10  && x<60);

// More than 2bconditiones at the same time, 3 conditiones
                      //        true    false   >>> true
        System.out.println( true || false|| false);
                     //        true    false   >>> false
       System.out.println( true && true && false);
                    //       false ||  false >>false || true >>>true
        System.out.println( x==50 || x==51 || x==55);

        //check x is more than 50, and x not 52, or x egual to 57
                     // true true >> true    false >>>true
        System.out.println( x>50 && x!=52 || x==57);


        System.out.println( false || true && true);
    }


}
