package februalry2025;

import java.util.Scanner;

public class CheckingIfANumberIsAPowerOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isPowerOf3 = checkPowerOfThree(number);
        System.out.println(isPowerOf3);

    }

    private static boolean checkPowerOfThree(int number) {
        if (number < 1) {
            return false;
        }

        while (number % 3 == 0) {
            number = number / 3;

        }
        return number == 1;
    }

}
