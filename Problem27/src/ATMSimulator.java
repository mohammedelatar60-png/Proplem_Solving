import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        List<String> transactionHistory = new ArrayList<>();

        boolean running = true;
        while (running) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        transactionHistory.add("Deposited: $" + depositAmount);
                        System.out.println("Successfully deposited $" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2:
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        transactionHistory.add("Withdrew: $" + withdrawAmount);
                        System.out.println("Successfully withdrew $" + withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 4:
                    System.out.println("Transaction History:");
                    if (transactionHistory.isEmpty()) {
                        System.out.println("No transactions yet.");
                    } else {
                        for (String transaction : transactionHistory) {
                            System.out.println("- " + transaction);
                        }
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}