package februalry2025;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int poweredNumber = number * number;

        String numberAsString = String.valueOf(number);
        String poweredNumberAsString = String.valueOf(poweredNumber);

        boolean isaAutomorphic = poweredNumberAsString.endsWith(numberAsString);

        System.out.println(isaAutomorphic ? "Yes" : "No");

    }
}
