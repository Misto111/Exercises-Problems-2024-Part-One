package January2025;

import java.util.Scanner;

public class ChangeValueOfTwoVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

       changeValueOfTwoVariables(num1, num2);
    }

    public static void changeValueOfTwoVariables(int num1, int num2) {

        if (num1 == num2) {
            System.out.println("The two numbers are equal");
            return;
        } else {

            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}
