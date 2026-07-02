package InstanceVariable_Methods;

/**
 * bank01_system
 */
public class bank01_system {


     public String accountHolder; // instance variable 
    public double balance;

    public void deposit(double amount) {  // instance methods
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void checkBalance() {
        System.out.println(balance);
    }

    public void accountDetails() {
        System.out.println(accountHolder);
        System.out.println(balance);
    }
}
