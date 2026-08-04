import java.util.Scanner;

public class BankingSystem {

    private static final int MAX_CUSTOMERS = 100;
    private static int[] accountNumbers = new int[MAX_CUSTOMERS];
    private static String[] names = new String[MAX_CUSTOMERS];
    private static double[] balances = new double[MAX_CUSTOMERS];
    private static int customerCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    searchAccount(scanner);
                    break;
                case 5:
                    displayAllAccounts();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    public static void createAccount(Scanner scanner) {
        if (customerCount >= MAX_CUSTOMERS) {
            System.out.println("System full. Cannot create more accounts.");
            return;
        }

        int accNum = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        double initialBalance = scanner.nextDouble();

        accountNumbers[customerCount] = accNum;
        names[customerCount] = name;
        balances[customerCount] = initialBalance;
        customerCount++;

        System.out.println("Account created successfully.");
    }

    public static void deposit(Scanner scanner) {
        int accNum = scanner.nextInt();
        double amount = scanner.nextDouble();

        int index = findAccountIndex(accNum);
        if (index != -1) {
            if (amount > 0) {
                balances[index] += amount;
                System.out.println("Deposited $" + amount + " successfully.");
            } else {
                System.out.println("Invalid amount.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void withdraw(Scanner scanner) {
        int accNum = scanner.nextInt();
        double amount = scanner.nextDouble();

        int index = findAccountIndex(accNum);
        if (index != -1) {
            if (amount > 0 && amount <= balances[index]) {
                balances[index] -= amount;
                System.out.println("Withdrew $" + amount + " successfully.");
            } else if (amount > balances[index]) {
                System.out.println("Insufficient funds.");
            } else {
                System.out.println("Invalid amount.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void searchAccount(Scanner scanner) {
        int accNum = scanner.nextInt();
        int index = findAccountIndex(accNum);

        if (index != -1) {
            System.out.println("Account Number: " + accountNumbers[index]);
            System.out.println("Name: " + names[index]);
            System.out.println("Balance: $" + balances[index]);
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void displayAllAccounts() {
        if (customerCount == 0) {
            System.out.println("No accounts registered.");
            return;
        }

        for (int i = 0; i < customerCount; i++) {
            System.out.println("Acc #: " + accountNumbers[i] + " | Name: " + names[i] + " | Balance: $" + balances[i]);
        }
    }

    private static int findAccountIndex(int accNum) {
        for (int i = 0; i < customerCount; i++) {
            if (accountNumbers[i] == accNum) {
                return i;
            }
        }
        return -1;
    }
}