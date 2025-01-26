package January2025;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int lcm = findLCM(a, b);

        System.out.println("Least common multiple is: " + lcm);

    }
    public static int findLCM(int a, int b) {
        return Math.abs(a * b) / findGCD(a, b);
    }

   public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
   }
}
