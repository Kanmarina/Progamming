package day34;

public class MathActionFromJDK {
    public static void main(String[] args) {

        //where is String class coming from
        //it's coming from a package called java.lang
        //it's a special package
        //and any class in it, does not need importing when being used
        //for example String class

        //what if I really want to explicitly(automatically) import String class
        //import java.lang.String (but it do it for me automatically)

      //  String str ="Hello";

        //there is a class under java.lang called Math
        //and it has lots of math utility methods that ready to be used

       int sum = Math.addExact(10,20);
        System.out.println(sum);

        System.out.println(Math.max(10,20));
    }
}
