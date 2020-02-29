package MuchtarsClasses.day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
    public static void main(String[] args) {
        BankAccount Sarahv=new BankAccount();

        Sarahv.setAccountHolder("Sarah");
        Sarahv.setAccountNumber(36542);
        System.out.println("Name:"+Sarahv.getAccountHolder());
        System.out.println("Account Number:"+Sarahv.getAccountNumber());
        System.out.println("Available Balance: "+Sarahv.getAvailableBalance());
        Sarahv.deposit(45555);
        Sarahv.ShowBalance();
        Sarahv.withDraw(25666);
        Sarahv.ShowBalance();
        Sarahv.deposit(10000);
        Sarahv.ShowBalance();

        BankAccount Serkan =new BankAccount();
        Serkan.setAccountHolder("Serkan");
        Serkan.setAccountNumber(6165486);
        Serkan.getAccountInfo();

        Serkan.deposit(3245);
        Serkan.ShowBalance();
        Serkan.withDraw(525452);
        Serkan.getAccountInfo();

        BankAccount [] accounts = {Sarahv,Serkan};
        ArrayList<BankAccount>Accounts =new ArrayList<>();
        Accounts.addAll(Arrays.asList(Sarahv,Serkan));
     //   System.out.println(accounts);
    }
}
