package februalry2025;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindingTheMostCommonWordInAText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] words = text.toLowerCase().split(" ");

        Set<String> commonWords = new HashSet<>();

        String commonWord = "";
        int count = 1;

        boolean found = false;

        for (String word : words) {
            if (!commonWords.contains(word)) {
                commonWords.add(word);

            } else {

                if (word.length() > 2) {
                    found = true;
                    commonWord = word;
                    count++;
                }
            }
        }

        if (found) {
            System.out.println(commonWord + ": " + count);
        } else {
            System.out.println("No common word found");
        }


    }
}
