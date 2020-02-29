package MuchtarsClasses.day43_Review_StaticInitEncaps;

public class LogIn {
    public static void main(String[] args) {

        Credentials obj1 = new Credentials();
//        obj1.userName ="Fatih";
//        obj1.password ="Pushka";
//
//        System.out.println(obj1.userName);
//        System.out.println(obj1.password);
        //read
        System.out.println(obj1.getUserName());
        System.out.println(obj1.getPassword());
        //modify
        obj1.setUserName( "fhghd");
        obj1.setPassword("dfhdfh ");
    }
}

