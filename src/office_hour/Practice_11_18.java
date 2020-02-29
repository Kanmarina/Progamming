package office_hour;

public class Practice_11_18 {
    public static void main(String[] args) {

        //System.out.println("aaa");
        // Compound operator \ Shorthand operator
        // +=; -=; *=; /=; %=

        //Increment and decrement operator
        // ++; --;

        //Relational Operator
        // > >= < <= checking more or less
        // == != checking for equality and inequality

        //Casting: converting one type to another
        //Upcasting \Type widening
                // converting data with smallermrange data type to bigger
        //range data type F.E: converting int to long, int to double
        //this happen automatically (implicitly)
        // double price = 99; if this printed out 99.0
double price = 99; //>>> 99.0
        long earthMoon = 150000;//>>>>150000 >>150000L
        //Downcasting \ type narrowing
                // converting data with bigger range data type to smaller
        // range data type F.E: converting double to int, or long to short
        //this must happen explicitly 9by user) Or It will not compile
        // Just like we can not put large coffe into small cup, It will spill
        //In order to make it to work, we need cast it explicitly
        //to tell compiler this is what we want to do even though potential data loss
        // occure
        //F.E: int priceAswholeNumber = 99.45; ERRor
        //int priceAswholeNumber = (int) 99.45;  >>>> 99 > 0.45 is Lost
int myMediumCup = (int) 100L;

        // Special case of char to int
        //each character is represented by numbers in ascii table

        char myLetter = 'A';
        System.out.println(myLetter);

         // int only store number
        //so here it turns the character into Ascii code number
        // represent of letter
         int myLetter2 = 'A';
        System.out.println(myLetter2);
        int myLetter3 ='a';
        System.out.println(myLetter3);

        char myLetter4 =106;
        System.out.println(myLetter4);
//...............................................
        // Positive and negative in programming

        // +
        // Arithmetic addition operator 5+10=15;
        // shorthand Operator int x=10; x+=3; >>>13
        //increment operator ++x, x++ increase the number 1
        //concatenation "Jon" + "Snow' = "Jon Snow"
        // It can also indicate a number is positive int i= +5;
        // Optional

        // -
        // Arithmetic substaction operator 15-10=5;
        // shorthand Operator int x=10; x-=3; >>>7
        //decrement operator --x, x-- decrease the number 1
        //It can also indicate a number is negative int i= +5;
        // Not Optional
        //F.E: int bankBalance = 190;

       int num = 10;
        System.out.println(  num==10);
        System.out.println(  num!=10);

        //we can store the result of relational operation
        // because all of them will return true or false
        boolean isNumEqual10 = (num ==10);

    }
}
