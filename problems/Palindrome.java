package februalry2025;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder palindrome = new StringBuilder(text).reverse();

        boolean isPalindrome = palindrome.toString().equals(text);
        System.out.println(isPalindrome);
        System.out.println(palindrome);
    }
}
