import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        int charCount = sentence.length();
        int wordCount = sentence.trim().isEmpty() ? 0 : sentence.trim().split("\\s+").length;
        int vowelCount = 0;
        int consonantCount = 0;

        String vowels = "aeiouAEIOU";

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        scanner.close();
    }
}