//  Sample Coding Test

// This class is responsible for executing our application

package encapsulation;

public class BankAccount {
        public static void main(String[] args) {

            //  Execution of Program

            //  1. main() starts
            //  2. Create account-1 object
            //  3. Create account-2 object
            //  4. Performs Transaction
            //  5. Display account details

            //  creating account - 1
            BankBalance account1 = new BankBalance("Rahul","ACC101",10000);

            //  creating account - 2
            BankBalance account2 = new BankBalance("Aman","ACC102",5000);

            // Rahul's transactions
            account1.deposit(2000);
            account1.withdraw(3000);

            // Aman's transaction
            account2.withdraw(7000);

            // Display details
            System.out.println("\n--- RAHUL'S ACCOUNT ---");
            account1.displayAccountDetails();

            System.out.println("\n--- AMAN'S ACCOUNT ---");
            account2.displayAccountDetails();
        }
}

