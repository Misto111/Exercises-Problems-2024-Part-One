package februalry2025;

import java.util.Arrays;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] digits = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();

        int sum = Arrays.stream(digits).sum();

        if (number % sum == 0) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
