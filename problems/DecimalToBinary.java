package februalry2025;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Двоичен запис: " + toBinary(number));
    }

    public static String toBinary(int number) {
        String binary = "";
        if (number == 0) {
            return "0";
        }
        while (number > 0) {
            binary = (number % 2) + binary;
            number /= 2;
        }
        return binary;
    }
}
