package day26;

public class SplitPractice {
    public static void main(String[] args) {

        //2 additional String method related to array
        // toCharArray()
        // split(bySomething)

      String survey = "Complete B15 Online 1 month Survey";
      
      char [] surveyChars = survey.toCharArray();
        for (char each : surveyChars) {
            System.out.println( "each char is : "+ each);

            //use while loop for fun
            int x = 0;
            while(x<surveyChars.length){
                System.out.println("each char is : "+ surveyChars[x]);
                x++;
            }
        }

            
        }

    }

