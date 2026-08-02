import java.util.Scanner;

public class MultiplicationChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= 12; i++) {
            int res = n * i;
            System.out.println(n + " * " + i + " = " + res);
            sum += res;
        }

        System.out.println(sum);

        sc.close();
    }
}