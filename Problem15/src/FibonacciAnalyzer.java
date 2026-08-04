import java.util.Scanner;

public class FibonacciAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        if (n <= 0) return;

        long first = 0;
        long second = 1;
        long sum = 0;
        long largest = 0;

        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            sum += first;
            largest = first;

            long next = first + second;
            first = second;
            second = next;
        }

        System.out.println("\nLargest Fibonacci Number: " + largest);
        System.out.println("Sum of all generated numbers: " + sum);
    }
}