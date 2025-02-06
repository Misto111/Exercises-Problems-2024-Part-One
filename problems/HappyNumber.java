package februalry2025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberString = scanner.nextLine();
        Set<Integer> seenNumbers = new HashSet<>();

        while (!numberString.equals("1") && !seenNumbers.contains(Integer.parseInt(numberString))){
            seenNumbers.add(Integer.parseInt(numberString));

            int[] digits = Arrays.stream(numberString.split("")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;

            for (int digit : digits) {
                sum += digit * digit;
            }
            numberString = String.valueOf(sum);
        }

        System.out.println(numberString.equals("1") ? "true" : "false");

    }
}
