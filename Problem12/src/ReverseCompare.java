import java.util.Scanner;

public class ReverseCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        long temp = Math.abs(number);
        long reversed = 0;

        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        if (number < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);

        if (number == reversed) {
            System.out.println("The original number is equal to its reverse.");
        } else {
            System.out.println("The original number is NOT equal to its reverse.");
        }
    }
}