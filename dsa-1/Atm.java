import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0; 

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double deposit = scanner.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("$" + deposit + " deposited. New balance: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }

                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient funds.");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else {
                        balance -= withdraw;
                        System.out.println("$" + withdraw + " withdrawn. New balance: $" + balance);
                    }

                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using the ATM.");
                    return; 
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
    }
}