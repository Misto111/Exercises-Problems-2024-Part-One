package cycles;

import java.util.Arrays;
import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Алгоритъм на Кадане
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : elements) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Максималната сума на подмасив е: " + maxSum);
    }
}
