package January2025;

import java.util.Scanner;

public class NumbersDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = divide(num1, num2);
            System.out.println("The result is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please, enter a valid number");

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using this program!");
        }

    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divide by zero is not allowed!");
        }

        return num1 / num2;
    }
}
