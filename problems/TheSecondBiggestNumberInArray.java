package cycles;

import java.util.Arrays;
import java.util.Scanner;

public class TheSecondBiggestNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int theBiggestNumber = Integer.MIN_VALUE;
        int secondBiggestNumber = Integer.MIN_VALUE;

        for (int num : numArray) {
            if (num > theBiggestNumber) {
                secondBiggestNumber = theBiggestNumber;
                theBiggestNumber = num;

            } else if (num > secondBiggestNumber && num < theBiggestNumber) {
                secondBiggestNumber = num;
            }
        }

        if(secondBiggestNumber == Integer.MIN_VALUE) {
            System.out.println("No second biggest number");
        } else {
            System.out.println(secondBiggestNumber);
        }

    }
}
