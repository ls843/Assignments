public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Error: Deposit amount must be positive");
            return;
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
            return;
        }

        if(amount > balance) {
            System.out.println("Error: Insufficient balance");
            return;
        }

        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());

        account.deposit(-500);

        account.withdraw(300);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(1000);

        account.withdraw(-50);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
