package cycles;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int searchedNumber = -1;

        for (int i = 0; i < numbers.length; i++) {

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count == 1) {
                searchedNumber = numbers[i];
            }
        }
        System.out.println(searchedNumber);
    }
}
