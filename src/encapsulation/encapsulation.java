//  Encapsulation doesn't require a single public class.
//  It also does not require multiple classes.

//  We can implement encapsulation using one class, two classes or many classes.
//  The number of classes is an architectural decision.

//  Encapsulation is about :
//  1. protecting an object's internal data
//  2. controlling how the data is accessed or modified

//  It protects variable by : private
//  It provides controlled access : public methods such as getters and setters


//package here organizes classes
package encapsulation;

// encapsulation can be done in one-class or multiple public class in seperate files of same source
public class encapsulation {

    //protects data from direct external access
    private double balance;

    //provides control modification
    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("deposited " + amount);
        }
    }

    //getter
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){

        //creates a reference to an object
        encapsulation account = new encapsulation();

        account.deposit(100000);
        account.deposit(200000);

        System.out.println("Current balance is: " + account.getBalance());
    }
}
