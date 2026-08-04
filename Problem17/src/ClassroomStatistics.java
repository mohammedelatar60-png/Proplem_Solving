
import java.util.Scanner;

public class ClassroomStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[10];

        System.out.println("Enter marks for 10 students:");
        for (int i = 0; i < 10; i++) {
            marks[i] = scanner.nextDouble();
        }

        double highest = marks[0];
        double lowest = marks[0];
        double sum = 0;
        int passedCount = 0;

        for (int i = 0; i < 10; i++) {
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest) lowest = marks[i];

            sum += marks[i];

            if (marks[i] >= 50) {
                passedCount++;
            }
        }

        double average = sum / 10;

        System.out.println("\nHighest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Average: " + average);
        System.out.println("Number of Passed Students: " + passedCount);
    }
}