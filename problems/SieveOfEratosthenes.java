package februalry2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }

        System.out.println(primes);
    }
}