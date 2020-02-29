package day14;

public class EmailChecker {
    public static void main(String[] args) {

        String email ="kan@gmail.com";
        boolean contain1 =  !email.contains("@");
        boolean contain2=   !email.contains(" ");
        boolean endWith1 = email.endsWith( "@gmail.com");
         boolean endWith2 = email.endsWith( "@yahoo.com");
         boolean endWith3 = email.endsWith( "@mail.ru");

        if (contain1 || contain2){
            System.out.println(" invalid email");
        }else if (endWith1){
            System.out.println("gmail");
        }else if (endWith2) {
            System.out.println("yahoo");
        } else if (endWith3) {
            System.out.println(" mail");

        }
    }
}
