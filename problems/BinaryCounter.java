package cycles;

import java.util.Scanner;

public class BinaryCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
