import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }

        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : originalArray) {
            uniqueSet.add(num);
        }

        System.out.println(uniqueSet);

        scanner.close();
    }
}