import java.util.Scanner;

public class MovieTicketPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 6) {
            System.out.println("Free Ticket");
        } else if (age <= 17) {
            System.out.println("Student Ticket");
        } else if (age <= 60) {
            System.out.println("Regular Ticket");
        } else {
            System.out.println("Senior Discount");
        }

        input.close();
    }
}