package februalry2025;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        StringBuilder palindrome = new StringBuilder(word);

        boolean isPalindrome = palindrome.reverse().toString().equals(word);

        System.out.println(isPalindrome);
    }
}
