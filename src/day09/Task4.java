package day09;

public class Task4 {
    public static void main(String[] args) {

      /*  1   —>> "Hello"
        2  —>> "Salam"
        3  —>> "Hola"
        4  —>> "Privet"
        5  —>> "Merhaba"
        6  —>> "Szia"
        7 —>  " bonjour"*/
        System.out.println("please select your option 1-7");
        String greeting ="";
        int language = 1;
        switch (language){

            case 1 :
                System.out.println(" Hello");
                break; //used to get out of this branch
            case 2 :
                System.out.println(" Privet");
                break;
            case 3 :
                System.out.println("Marhaba");
                break;
            case 4 :
                System.out.println("Salam");
                break;
            case 5 :
                System.out.println("Bonjour");
                break;
            case 6 :
                System.out.println("Hola");
                break;
            case 7 :
                System.out.println("szea");
                break;
            default:
                System.out.println(" nothing");
        }



    }
}
