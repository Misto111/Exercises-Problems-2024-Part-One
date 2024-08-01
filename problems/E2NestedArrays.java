package crackingTheCodingInterview;

import java.util.Arrays;
import java.util.Scanner;

public class E2NestedArrays {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        printArrays(numbers);

    }

    private static void printArrays(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                System.out.println(numbers[i] + ", " + numbers[j]);
            }
        }
    }


}
