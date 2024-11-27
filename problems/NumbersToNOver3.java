package cycles;

import java.util.Scanner;

public class NumbersToNOver3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i += 3) {
            if (i == 0) {
                continue;
            }

            stringBuilder.append(i).append(System.lineSeparator());
        }

        System.out.println(stringBuilder);
    }
}
