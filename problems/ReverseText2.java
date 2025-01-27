package January2025;

import java.util.Scanner;

public class ReverseText2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String reversedText = reverseText(text);

        System.out.println(reversedText);

    }

    public static String reverseText(String text) {

        if (text == null || text.isEmpty()) {
            return text;
        }
        StringBuilder reversed = new StringBuilder(text);

       return reversed.reverse().toString();
    }
}
