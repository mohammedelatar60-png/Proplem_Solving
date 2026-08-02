import java.util.Scanner;

public class ATMpin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int correctPin = 1234;

        System.out.print("Enter PIN: ");
        int pin = input.nextInt();

        if (pin == correctPin) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Invalid PIN");
        }

        input.close();
    }
}