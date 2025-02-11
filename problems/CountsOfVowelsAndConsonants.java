package februalry2025;

import java.util.Scanner;

public class CountsOfVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                switch (Character.toLowerCase(c)) {
                    case 'a', 'e', 'i', 'o', 'u' -> vowelCount++;
                    default -> consonantCount++;
                }
            }
        }

        System.out.printf("Vowels: %d, Consonants: %d", vowelCount, consonantCount);
    }
}
