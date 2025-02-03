package februalry2025;

import java.util.Arrays;
import java.util.Scanner;

public class TheSecondLargestNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length - 2]);
    }
}
