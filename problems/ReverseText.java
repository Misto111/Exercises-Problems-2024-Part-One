package January2025;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        reverse(text);
    }

    public static String reverse(String text) {
        for (int i = text.length() - 1; i >= 0 ; i--) {

            System.out.print(text.charAt(i));
            }
           return text;
        }
    }


