package februalry2025;

import java.util.Scanner;

public class AmicableNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int sumX = getDivisorsSum(x);
        int sumY = getDivisorsSum(y);

        if (sumX == y && sumY == x) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static int getDivisorsSum(int num) {
       int sum = 0;
       for (int i = 1; i <= num / 2; i++) {
           if (num % i == 0) {
               sum += i;
           }
       }
       return sum;
    }

}
