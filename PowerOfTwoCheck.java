package februalry2025;

import java.util.Scanner;

public class PowerOfTwoCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isPowerOfTwo = number > 0;

        while (number > 1) {
            if (number % 2 != 0) {
                isPowerOfTwo = false;
                break;
            }
            number /= 2;
        }

        System.out.println(isPowerOfTwo ? "true" : "false");
    }
}
