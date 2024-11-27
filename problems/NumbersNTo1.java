package cycles;

import java.util.Scanner;

public class NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = n; i >= 1; i--) {

            stringBuilder.append(i).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }
}
