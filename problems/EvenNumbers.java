package January2025;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfIterations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfIterations; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 ==0) {
                System.out.printf("The number %d is even.%n", number);
            } else {
                System.out.printf("The number %d is odd%n", number);
            }
        }

    }
}
