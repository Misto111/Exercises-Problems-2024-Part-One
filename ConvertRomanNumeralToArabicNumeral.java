package februalry2025;

import java.util.Scanner;

public class ConvertRomanNumeralToArabicNumeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String romanNumeral = scanner.nextLine();

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0 ; i--) {
            char current = romanNumeral.charAt(i);
            int currentValue = 0;

            if (current == 'I') currentValue = 1;
            else if (current == 'V') currentValue = 5;
            else if (current == 'X') currentValue = 10;
            else if (current == 'L') currentValue = 50;
            else if (current == 'C') currentValue = 100;
            else if (current == 'D') currentValue = 500;
            else if (current == 'M') currentValue = 1000;

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        System.out.println(result);
    }
}
