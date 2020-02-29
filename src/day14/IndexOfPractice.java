package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        //indexOff
        //find out index of another String inside this string
        //            012345678901
        String name ="Game of Java";
        //find out the location of Java
        //find out the location of letter 0
        //find out the location of first space

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf("O"));
        System.out.println(name.indexOf(" "));
    }
}
