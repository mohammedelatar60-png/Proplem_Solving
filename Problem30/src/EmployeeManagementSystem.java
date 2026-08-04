import java.util.Scanner;

public class EmployeeManagementSystem {

    private static final int MAX_EMPLOYEES = 100;
    private static int[] ids = new int[MAX_EMPLOYEES];
    private static String[] names = new String[MAX_EMPLOYEES];
    private static double[] salaries = new double[MAX_EMPLOYEES];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    searchEmployee(scanner);
                    break;
                case 3:
                    updateSalary(scanner);
                    break;
                case 4:
                    deleteEmployee(scanner);
                    break;
                case 5:
                    displayAllEmployees();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    public static void addEmployee(Scanner scanner) {
        if (count >= MAX_EMPLOYEES) {
            System.out.println("System full. Cannot add more employees.");
            return;
        }

        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        ids[count] = id;
        names[count] = name;
        salaries[count] = salary;
        count++;

        System.out.println("Employee added successfully.");
    }

    public static void searchEmployee(Scanner scanner) {
        int id = scanner.nextInt();
        int index = findEmployeeIndex(id);

        if (index != -1) {
            System.out.println("ID: " + ids[index] + " | Name: " + names[index] + " | Salary: $" + salaries[index]);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void updateSalary(Scanner scanner) {
        int id = scanner.nextInt();
        double newSalary = scanner.nextDouble();

        int index = findEmployeeIndex(id);
        if (index != -1) {
            salaries[index] = newSalary;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void deleteEmployee(Scanner scanner) {
        int id = scanner.nextInt();
        int index = findEmployeeIndex(id);

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                ids[i] = ids[i + 1];
                names[i] = names[i + 1];
                salaries[i] = salaries[i + 1];
            }
            count--;
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + ids[i] + " | Name: " + names[i] + " | Salary: $" + salaries[i]);
        }
    }

    private static int findEmployeeIndex(int id) {
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                return i;
            }
        }
        return -1;
    }
}