package crackingTheCodingInterview;

import java.util.Scanner;

public class E4PrintUnorderedPairs2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = {1, 2, 3, 4};
        int [] secondNumbers = {1, 2, 3, 4, 5};

        printUnorderedPairs(numbers, secondNumbers);
    }

    private static void printUnorderedPairs(int[] numbers, int[] secondNumbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < secondNumbers.length; j++) {

                if (numbers[i] < secondNumbers[j]) {

                    System.out.println(numbers[i] + ", " + secondNumbers[j]);
                }
            }
        }
    }
}
