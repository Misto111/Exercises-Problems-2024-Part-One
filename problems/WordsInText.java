package februalry2025;

import java.util.Scanner;

public class WordsInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().trim(); // Премахваме водещи/завършващи интервали

        if (text.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Разделяме текста по интервали и броим думите
        String[] words = text.split("\\s+");
        System.out.println(words.length);
    }
}