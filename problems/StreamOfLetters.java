package cycles;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        char letter = ' ';

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);

            System.out.println(letter);
        }
    }
}
