
import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        long sum = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }

        double average = (double) sum / size;

        System.out.println("Largest Element: " + max);
        System.out.println("Smallest Element: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}