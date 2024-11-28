package cycles;

import java.util.Arrays;
import java.util.Scanner;

public class SpecialElement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < elements.length; i++) {

            int minNumbers = 0;
            int maxNumbers = 0;

            for (int j = 0; j < elements.length; j++) {
                if (elements[i] > elements[j]) {
                    minNumbers++;
                } else if (elements[i] < elements[j]) {
                    maxNumbers++;
                }

            }

            if (minNumbers == 3 && maxNumbers == elements.length - minNumbers - 1) {
                System.out.println(elements[i]);
                break;
            }
        }
    }
}
//2 14 3 11 7 4 6 22 45 12 5