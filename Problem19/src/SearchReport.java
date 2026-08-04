import java.util.Scanner;

public class SearchReport {
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

        System.out.print("Enter target number: ");
        int target = scanner.nextInt();

        int firstPosition = -1;
        int occurrences = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                if (firstPosition == -1) {
                    firstPosition = i;
                }
                occurrences++;
            }
        }

        if (occurrences > 0) {
            System.out.println("Found");
            System.out.println("Position: " + firstPosition);
            System.out.println("Number of Occurrences: " + occurrences);
        } else {
            System.out.println("Not Found");
        }
    }
}