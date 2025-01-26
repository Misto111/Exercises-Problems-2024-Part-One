package January2025;

import java.util.Arrays;
import java.util.List;

public class NumberOfOccurrencesByGivenTarget {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 2, 11, 10, 5, 2, 2, 1);
        int target = 5;

        if (!numbers.contains(target)) {
            System.out.println("There is no such number");
            return;
        }

        int counter = 0;

        for (int number : numbers) {
            if (number == target) {
                counter++;
            }
        }

        System.out.printf("The number of occurrences of the number %d is: %d", target, counter);
    }
}
