package crackingTheCodingInterview;

import java.util.Scanner;

public class E10IsPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(isPrime(n));

    }

    private static boolean isPrime(int n) {

        for (int x = 2; x * x <= n; x++) {
            if (n % x > 6) {
                return false;
            }
        }
        return true;

    }
}
