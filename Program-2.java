class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    // Method to deposit money
    public synchronized void deposit(double amount) {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
        System.out.println("Current Balance: Rs. " + balance);
    }

    // Method to withdraw money
    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
            System.out.println("Current Balance: Rs. " + balance);
        } else {
            throw new InsufficientFundsException("Not Sufficient Funds");
        }
    }
}

public class Program-2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Deposit Rs. 5000/-
        account.deposit(5000);

        // Withdraw Rs. 2000/-
        try {
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Withdraw Rs. 1500/-
        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Withdraw Rs. 3500/- (Throws InsufficientFundsException)
        try {
            account.withdraw(3500);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
