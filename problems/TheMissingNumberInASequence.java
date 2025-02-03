package februalry2025;

import java.util.Arrays;
import java.util.Scanner;

public class TheMissingNumberInASequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Проверка дали липсва първото число (1)
        if (numbers[0] != 1) {
            System.out.println(1);
            return;
        }

        // Проверка за липсващо число в средата
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 1 != numbers[i + 1]) {
                System.out.println(numbers[i] + 1);
                return;
            }
        }

        // Ако всички числа са последователни, липсващото е последното
        System.out.println(numbers[numbers.length - 1] + 1);
    }
}
