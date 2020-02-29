package MuchtarsClasses.day09;

public class If_Statement {
    public static void main(String[] args) {
        int num1 =200;
        int num2 =300;
        int max=0;
        if (num1>num2){
            max+=num1;
         //   System.out.println("max = " + max);
        }
        if (num1<num2) {
            max += num2;
        }
        System.out.println("max = " + max);


        //task 2
        int hours =25;
        int minutes =45;
        int seconds =30;

        String amOrPm = "pm";
        System.out.println(hours+":"+minutes+":"+seconds+" "+amOrPm);

        //task 3
        int n1=100, n2 =500, n3 =700;
        int maximum =0;
        //in order to n1 be the maximum
        if (n1>n2 && n1>n3){
            maximum += n1;
        }
        if (n2>n1 && n2>n3) {
            maximum += n2;
        }
        if (n3>n2 && n1<n3) {
            maximum += n3;
        }

        System.out.println("Maximum number between "+n1+", "+n2+", "+n3+" = "+maximum);
    }

}
