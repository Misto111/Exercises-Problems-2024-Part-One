package februalry2025;

import java.util.Scanner;

public class LongestWordInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] words = text.split(" ");

        String longestWord = words[0];

        int count = 1;

        for (int i = 0; i < words.length - 1; i++) {


            if (words[i].length() > words[i + 1].length()) {
                longestWord = words[i];
            } else {

                if (longestWord.length() < words[i + 1].length()) {
                    longestWord = words[i + 1];
                }

            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (longestWord.length() == words[i].length()) {
                count++;
            }
        }


        if (count != 1) {
            System.out.printf("Find: %d longest words. One of them is: %s\n", count, longestWord);
        } else {

            System.out.println(longestWord);
        }
    }
}
