package februalry2025;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder palindrome = new StringBuilder(input).reverse();

        boolean isPalindrome = palindrome.toString().equals(input);
        System.out.println(isPalindrome);

    }
}
