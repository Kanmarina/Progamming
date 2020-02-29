package MuchtarsClasses.day44_AccessModifiers;

public class BankAccount {
   private String AccountHolder;
    private long AccountNumber;
    private double AvailableBalance;

    //getter
    public String getAccountHolder(){
        return AccountHolder;
    }
    public long getAccountNumber(){
        return AccountNumber;
    }
    public double getAvailableBalance(){
        return AvailableBalance;
    }
    //setter

    public void setAccountHolder(String AccountHolder){ //local variable
        this.AccountHolder =AccountHolder;//instance variable
    }
    public void setAccountNumber(long AccountNumber){
        this.AccountNumber =AccountNumber;
    }
   //Actions
            //deposit:
    public void deposit(double amount){
        AvailableBalance+=amount;
    }
    public void withDraw(double amount){
        if ( AvailableBalance<=0){
            System.out.println("your account less than 0");
            return;
        }
        if (amount >AvailableBalance){
            AvailableBalance-=35;
        }
        AvailableBalance -=amount;
    }
    //checking balance
    public void ShowBalance(){
        System.out.println("available balance"+AvailableBalance);
    }
    //get account info
    public void getAccountInfo(){
        System.out.println("Name:"+ getAccountHolder());
        System.out.println("Account Number:"+ getAccountNumber());
        System.out.println("Available Balance: "+ getAvailableBalance());

    }
}
