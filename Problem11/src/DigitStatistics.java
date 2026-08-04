import java.util.Scanner;

public class DigitStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        long temp = Math.abs(number);
        int count = 0;
        int sum = 0;
        int maxDigit = 0;
        int minDigit = 9;

        if (temp == 0) {
            count = 1;
            minDigit = 0;
        }

        while (temp > 0) {
            int digit = (int) (temp % 10);
            count++;
            sum += digit;
            if (digit > maxDigit) maxDigit = digit;
            if (digit < minDigit) minDigit = digit;
            temp /= 10;
        }

        System.out.println("Number of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Largest digit: " + maxDigit);
        System.out.println("Smallest digit: " + minDigit);
    }
}