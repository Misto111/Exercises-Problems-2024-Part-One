package februalry2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequenceInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        List<Integer> longestSubsequence = new ArrayList<>();
        List<Integer> currentSubsequence = new ArrayList<>();

        currentSubsequence.add(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentSubsequence.add(numbers[i]);
            } else {
                if (currentSubsequence.size() > longestSubsequence.size()) {
                    longestSubsequence = new ArrayList<>(currentSubsequence);
                }
                currentSubsequence.clear();
                currentSubsequence.add(numbers[i]);
            }
        }

        // Проверяваме последната подредица
        if (currentSubsequence.size() > longestSubsequence.size()) {
            longestSubsequence = new ArrayList<>(currentSubsequence);
        }

        // Извеждаме резултата
        System.out.println(longestSubsequence);
    }
}
