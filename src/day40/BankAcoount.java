package day40;

public class BankAcoount {

    String accountType;
    String accountHolder;
    long accounNumber;
    double balance;

    //setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber,double newBalance ){
        accountType=newAccountType;
        accounNumber =newAccountNumber;
        balance =newBalance;
    }
    //show account balance
  public void showAccountBalance(){
      System.out.println("current balance = "+ balance);
  }
  //showAccountHolderAccountType
    public void showAccountHolderAccountType(){
        System.out.println("account holder is "+ accountHolder+"accountType = " + accountType);
    }
    //getBalance return the balance
public double getBalance(){
        return balance;
}
    //deposit (amount)

public void deposit(double amount){
       balance=balance+amount;

}
    //withdraw (amount)
    public void withdraw (double amount){
        balance-=amount;
    }
    //withdraw100$Cash()
    public void withdraw100$Cash(){
        withdraw(100); //reusing the functionality we already have
        //or balance=balance -100
    }

    //purchaseProduct(productPrice,count)
public void purchaseProduct (double productPrice, int count){
        double totalPrice = productPrice * count;
        balance-=totalPrice;
        //or
    //withdraw(totalPrice)
}
    //toString


    public String toString() {
        return "BankAcoount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accounNumber=" + accounNumber +
                ", balance=" + balance +
                '}';
    }
}
