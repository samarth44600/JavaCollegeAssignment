// Define a checked exception called InsufficientFundsException that represents an
// insufficient balance scenario in a banking application. Develop a simple banking program
// that utilizes this exception when withdrawing money from an account, and handle it
// appropriately.

package assignment6;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            throw new InsufficientFundsException("Insufficient funds to withdraw $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingProgram4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            account.withdraw(500.0);
            account.withdraw(800.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Remaining balance: $" + account.getBalance());
    }
}

// output
// Withdrawal of $500.0 successful.
// Error: Insufficient funds to withdraw $800.0
// Remaining balance: $500.0
