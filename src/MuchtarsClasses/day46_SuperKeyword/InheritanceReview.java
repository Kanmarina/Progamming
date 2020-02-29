package MuchtarsClasses.day46_SuperKeyword;

class Data{
   public  int num1 =10;
    protected   int num2 =20;
    private   int num3 =30;
     int num4 =40;

}

public class InheritanceReview extends Data{

    public static void main(String[] args) {

        InheritanceReview obj = new InheritanceReview();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    //    System.out.println(num3);
        System.out.println(obj.num4);
    }
}
