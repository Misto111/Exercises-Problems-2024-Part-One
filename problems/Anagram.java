package January2025;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        if (isAnagram(word1, word2)) {
            System.out.println("The words are anagrams.");
        } else {
            System.out.println("The words are not anagrams.");
        }


    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
