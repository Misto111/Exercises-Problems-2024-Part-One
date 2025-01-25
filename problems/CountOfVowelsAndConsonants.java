package January2025;

import java.util.Scanner;

public class CountOfVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        String vowels = "aeiouy";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Проверяваме дали символът е буква
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) { // Проверяваме дали е гласна
                    vowelCount++;
                } else { // Ако не е гласна, значи е съгласна
                    consonantCount++;
                }
            }
        }

        System.out.printf("Vowels: %d, Consonants: %d", vowelCount, consonantCount);
    }
}
