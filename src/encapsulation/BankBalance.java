//  Sample Coding Test

//  This class is responsible for account data and business operations.

package encapsulation;

public class BankBalance{

    //  1. Private Instance Variables
    private String accountHolder;
    private String accountNumber;
    private double balance;


    //  But how does Java receive the values above?
    //  Through a constructor.

    //  2. Constructor
    public BankBalance(String accountHolder,String accountNumber,double balance){
        if(balance<0){
            throw new IllegalArgumentException("Initial Balance cannot be negative");
        }
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //  3. Deposit
    public void deposit(double amount){
        if(amount >0) {
            balance = balance + amount;
            System.out.println("Deposited " + amount);
        }else{
            System.out.println("Invalid Amount");
        }
    }

    // 4. Withdraw
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance ");
        }
        else if(amount <= 0){
            System.out.println("Invalid withdrawl amount");
        }else{
            balance = balance - amount;
            System.out.println("Withdrawn " + amount);
        }
    }

    //  5. Getters
    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    //  6. Display Account Details
    public void displayAccountDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }


}
