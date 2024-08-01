package crackingTheCodingInterview;

import java.util.Scanner;

public class E5PrintUnorderedPairs3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = {1, 2, 3};
        int [] numbers2 = {1, 2, 3};
        int [] numbers3 = {1, 2, 3};

        printUnorderedPairs(numbers, numbers2, numbers3);
    }

    public static void printUnorderedPairs(int[] numbers, int[] numbers2, int[] numbers3) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                for (int k = 0; k < 2; k++) {

                    System.out.println(numbers[i] + ", " + numbers2[j]);
                }
            }
        }
    }
}
