package MuchtarsClasses.day11;

public class Warm_up {
    public static void main(String[] args) {
        int n1=4;
        int n2 =4;
        int n3 =4;

        if(n1==n2 &&  n1!=n3){
            System.out.println("n1&n2 are equal");
        }else if(n2==n3&& n2!=n1){
            System.out.println("n3&n2 are equal");
        }else if (n1==n2 && n1==n3 && n2==n3){
            System.out.println("all equal");
        }else{
            System.out.println("non equal");
        }

    }
}
