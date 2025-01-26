package January2025;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder reversedInput = new StringBuilder();
        reversedInput.append(input).reverse();

        boolean isPalindrome = reversedInput.toString().equals(input);

        System.out.println(isPalindrome);
        System.out.println(reversedInput);
    }
}