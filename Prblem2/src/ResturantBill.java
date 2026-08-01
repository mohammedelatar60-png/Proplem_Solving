import java.util.Scanner;

public class ResturantBill {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of meal 1: ");
        double meal1 = input.nextDouble();

        System.out.print("Enter price of meal 2: ");
        double meal2 = input.nextDouble();

        System.out.print("Enter price of meal 3: ");
        double meal3 = input.nextDouble();

        double totalPrice = meal1 + meal2 + meal3;
        double vat = totalPrice * 0.14;
        double finalPrice = totalPrice + vat;

        System.out.println("\n===== Restaurant Bill =====");
        System.out.printf("Total Price : %.2f%n", totalPrice);
        System.out.printf("VAT (14%%)   : %.2f%n", vat);
        System.out.printf("Final Price : %.2f%n", finalPrice);
        System.out.printf("Final Price : %.2f%n", finalPrice);
        System.out.println("===========================");

        input.close();
    }
}