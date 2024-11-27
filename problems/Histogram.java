package cycles;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1Count++;
            } else if (num <= 399) {
                p2Count++;
            } else if (num <= 599) {
                p3Count++;
            } else if (num <= 799) {
                p4Count++;
            } else {
                p5Count++;
            }
        }

        System.out.printf("%.2f%%%n", p1Count * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p2Count * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p3Count * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p4Count * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p5Count * 1.0 / n * 100);
    }
}
