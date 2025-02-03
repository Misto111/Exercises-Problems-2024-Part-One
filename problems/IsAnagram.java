package februalry2025;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();


        if (word1.length() != word2.length()) {
            System.out.println("The words is not an anagrams.");
            return;
        }

        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        System.out.println(Arrays.equals(char1, char2));


        }

    }
