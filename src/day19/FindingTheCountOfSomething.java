package day19;

public class FindingTheCountOfSomething {
        public static void main(String[] args) {

            //from 1-100 print out all the numbers can be divided by
            //by 15 without remainder
            //from 1-100 count how many numbers can be divided by 15

            int counter =0;

            for (int i = 1; i <=100 ; i ++) {
                if( i %15==0){
                    System.out.println( i);
                    ++counter;
                }

            }
            System.out.println("counter = " + counter);


            //giving String with value find out how
            // many A showed in this string

            String name = "Marina Kan";
            int countOfA =0;
            for (int i  = 0; i  <= name.length() ; i ++) {
              //  System.out.println( name.charAt(i) );


                if(name.charAt(i) == 'a'){
                 //   System.out.println("Bingo Found it");
                    ++countOfA;
                }
            }
            System.out.println(countOfA);
        }
}
