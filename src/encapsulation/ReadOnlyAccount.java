package encapsulation;

public class ReadOnlyAccount {
    //  Private Variable :- outside classes cannot directly
    //  access the variable
    private String accountNumber;

    //  Constructor :- intializes the account number when the
    //  object is created
    public ReadOnlyAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    //  Getter :- allows other classes to read the value
    public String getAccountNumber() {
        return accountNumber;
    }
}
