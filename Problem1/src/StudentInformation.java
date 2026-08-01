import java.util.Scanner;

public class StudentInformation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your university: ");
        String university = input.nextLine();

        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();

        System.out.println("\n===== Student Card =====");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("University : " + university);
        System.out.println("GPA        : " + gpa);
        System.out.println("========================");

        input.close();
    }
}