package day15;

public class SubString {
    public static void main(String[] args) {
        //getting the part of the string out of another string
        //
        //              012345678912345
        String movie = "Lord of the Ring";
     // Sub string will return part of another string
        //starting from the beginning index untill right before
        //ending index
        //wanna get the String of form this movie

        String wordOf = movie.substring(5,9);
        System.out.println("word of ="+ wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("word The ="+ wordThe);

     //Get from the second word till last word
     // //                        012345678912345
        //        String movie = "Lord of the Ring";

    //  int startingPoint = movie.indexOf(" ")+1;
   //   int endingPoint = movie.length();

   //     System.out.println("second word till last: "+ movie.substring(startingPoint,endingPoint));

   String secondWordTillLast = movie.substring(5,16);
        System.out.println("Second Word Till Last = "+ secondWordTillLast);
 String wordLordOf = movie.substring(0,6);
        System.out.println(wordLordOf);
        // If you want to start from somewere and just get
        //the rest of the String above method will work
        //however there is even better method
        //if you provide only one parametr to substing method
        //it will just start from one location and get till end
         String secondToLast = movie.substring(5);

         //reverse to "Ring of the Lord"
//                                01234567891 2345
        //        String movie = "Lord of the Ring";

        System.out.println( movie.substring(12,16)+" "+ movie.substring(5,7)
        +" "+ movie.substring(8,12)+" "+ movie.substring(0,4));

        //Turn to Rig of the java Lord

        System.out.println( movie.substring(12,16)+" "+ movie.substring(5,7)
                +" "+ movie.substring(8,12)+" "+" Java " +movie.substring(0,4));

    }
}
