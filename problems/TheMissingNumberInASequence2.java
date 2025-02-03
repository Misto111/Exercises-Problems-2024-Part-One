package februalry2025;

import java.util.Arrays;
import java.util.Scanner;

public class TheMissingNumberInASequence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = numbers.length + 1; // Истинският размер на пълната последователност
        int expectedSum = n * (n + 1) / 2; // Сума на първите N естествени числа
        int actualSum = Arrays.stream(numbers).sum(); // Сума на входните числа

        System.out.println("Липсващото число е: " + (expectedSum - actualSum));
    }
}
