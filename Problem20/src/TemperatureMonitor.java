import java.util.Scanner;

public class TemperatureMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temps = new double[7];

        System.out.println("Enter temperatures for 7 days:");
        for (int i = 0; i < 7; i++) {
            temps[i] = scanner.nextDouble();
        }

        double highest = temps[0];
        double lowest = temps[0];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            if (temps[i] > highest) {
                highest = temps[i];
            }
            if (temps[i] < lowest) {
                lowest = temps[i];
            }
            sum += temps[i];
        }

        double average = sum / 7;
        int daysAboveAverage = 0;

        for (int i = 0; i < 7; i++) {
            if (temps[i] > average) {
                daysAboveAverage++;
            }
        }

        System.out.println("Highest Temperature: " + highest);
        System.out.println("Lowest Temperature: " + lowest);
        System.out.println("Weekly Average: " + average);
        System.out.println("Days Above Average: " + daysAboveAverage);
    }
}