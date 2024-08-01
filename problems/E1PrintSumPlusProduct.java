package crackingTheCodingInterview;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class E1PrintSumPlusProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        printSumPlusProduct(nums);
    }

    private static void printSumPlusProduct(@NotNull int [] nums) {

        int sum = 0;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        System.out.println(sum + ", " + product);
    }
}
