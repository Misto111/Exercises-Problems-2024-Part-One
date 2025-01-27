package January2025;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isPalindrome = false;
        StringBuilder palindrome = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {

             palindrome.append(input.charAt(i));

        }
        if (palindrome.toString().equals(input)) {
            isPalindrome = true;
        }

        System.out.println(isPalindrome);
    }
}
