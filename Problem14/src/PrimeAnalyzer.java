import java.util.Scanner;

public class PrimeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        if (number <= 1) {
            System.out.println("Not Prime");
            System.out.println("Smallest divisor: " + number);
            return;
        }

        long smallestDivisor = number;
        boolean isPrime = true;

        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                smallestDivisor = i;
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
            System.out.println("Smallest divisor: " + smallestDivisor);
        }
    }
}