package day41;

import day40.BankAcoount;

public class AccessModifierIntro {
    public static void main(String[] args) {

        BankAcoount b1= new BankAcoount();
        b1.showAccountBalance();

        Person p1 =new Person();
        p1.setAll("Hasan", 34, 1234555);
        System.out.println("p1 = " + p1);
        System.out.println("p1.getName() = " + p1.getName());
        p1.setName("Emma");
        System.out.println("p1.getName() = " + p1.getName());
        p1.setAge(21);
        p1.setSsn(987654321);

        int emmaAge = p1.getAge();
        System.out.println("emmaAge = " + emmaAge);

        System.out.println("p1 = " + p1);


    }
}
