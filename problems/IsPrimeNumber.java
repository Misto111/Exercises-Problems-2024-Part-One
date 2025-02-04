package februalry2025;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isPrimeNumber = true;

        if (number < 2) {
            isPrimeNumber = false;
        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }


            System.out.println(isPrimeNumber ? "Yes" : "No");
        }


    }
}
