import java.util.Scanner;

public class StudentRankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String topStudent = "";
        double maxMark = Double.NEGATIVE_INFINITY;

        String lowestStudent = "";
        double minMark = Double.POSITIVE_INFINITY;

        double totalMarks = 0;
        int passedCount = 0;

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            double mark = scanner.nextDouble();

            if (mark > maxMark) {
                maxMark = mark;
                topStudent = name;
            }

            if (mark < minMark) {
                minMark = mark;
                lowestStudent = name;
            }

            totalMarks += mark;

            if (mark >= 50) {
                passedCount++;
            }
        }

        double average = n > 0 ? totalMarks / n : 0;

        System.out.println("Top Student: " + topStudent);
        System.out.println("Lowest Student: " + lowestStudent);
        System.out.println("Class Average: " + average);
        System.out.println("Passed Students: " + passedCount);

        scanner.close();
    }
}