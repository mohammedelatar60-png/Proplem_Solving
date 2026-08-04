import java.util.Scanner;
import java.util.Random;

public class GuessTheSecretNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        while (guess != secret) {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secret) {
                System.out.println("Too High");
            } else if (guess < secret) {
                System.out.println("Too Low");
            }
        }

        System.out.println("Congratulations! Total attempts: " + attempts);
    }
}