package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {
        //initializing(giving value) int offerCount = 2;
        int offerCount = 2;
        //incresing the number by one using normal way
        //offercount = offercount +1;
        //this is increasing the value by one using compound/shortland operator
       // offerCount+=1;


        // Since increasing or decreasing a value is very special
        // And often used in programming
        // There is even shorter shortcut for this operation
        //And we use ++ or -- , ONLY FOR ONE

      //   ++offerCount; +=1; oferCount = oferCount +1

        ++offerCount;
        System.out.println("Offer now after incresing by one  "
                + offerCount);
        --offerCount;
        System.out.println("Offer now after decresing by one  "
                + offerCount);




    }
}
