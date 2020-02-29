package day31;

public class MethodPractice {

        //write a piece of code reusable code count 1 to 10
        //give a name count1to10                         : method name
        //no need for object when being called           :static
        //it should be accessible anywhere in your project:public
    //it does not return any value                        : void
    //does not need any external data when being called    : nothing inside
        public static void main(String[] args) {
            count1to10();
            //System.out.println();
            count1to10();

        }

    public static void count1to10(){
        for (int i = 0; i <=10; i++) {
            System.out.print (i+" ");
        }
        System.out.println();
    }
public static void countDownfrom20(){
    for (int i = 20; i>=0  ; i--) {

    }
}


}
