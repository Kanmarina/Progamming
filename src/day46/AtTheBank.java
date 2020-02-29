package day46;

public class AtTheBank {
    public static void main(String[] args) {
        
        CheckingAccount acc1 =new CheckingAccount("Marina",123456,10000);
        acc1.deposit(10000);
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(5000);
        System.out.println("acc1 = " + acc1);
    }
}
