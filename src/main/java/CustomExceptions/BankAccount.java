package CustomExceptions;

// Custom exception for Insufficient Funds


// Custom exception for Invalid Withdrawal

// BankAccount class
public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to perform withdrawal
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

