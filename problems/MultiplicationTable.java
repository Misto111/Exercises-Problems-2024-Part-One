package January2025;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
           int multiplication = number * i;

            System.out.printf("%d x %d = %d%n", number, i, multiplication);
        }
    }
}
