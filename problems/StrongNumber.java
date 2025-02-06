package februalry2025;

import java.util.Arrays;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberStr = scanner.nextLine();
        int[] numbers = Arrays.stream(numberStr.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int fact = 1;


        for (int number : numbers) {
            for (int i = 1; i <= number; i++) {

                fact *= i;

            }
            sum += fact;

            fact = 1;
        }

        System.out.println(sum == Integer.parseInt(numberStr) ? "true" : "false");

        }

}
