package cycles;

import java.util.Scanner;

public class EvanPowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double numToPower = Double.parseDouble(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= n; i += 2) {

                double poweredNum = Math.pow(numToPower, i);
                System.out.printf("%.0f%n", poweredNum);

        }
    }
}
