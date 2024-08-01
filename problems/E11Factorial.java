package crackingTheCodingInterview;

import java.util.Scanner;

public class E11Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }
}
