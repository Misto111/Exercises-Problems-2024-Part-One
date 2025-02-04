package februalry2025;

import java.util.Scanner;

public class ReversedNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        StringBuilder reversedNumber = new StringBuilder(number).reverse();

        System.out.println("Reversed number: " + reversedNumber);




    }
}
