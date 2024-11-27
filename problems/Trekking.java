package cycles;

import java.util.Scanner;

public class Trekking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfGroups = Integer.parseInt(scanner.nextLine());

        int countMusala = 0;
        int countMonblan = 0;
        int countKilimandjaro = 0;
        int countK2 = 0;
        int countEverest = 0;

        int totalPeople = 0;

        for (int i = 0; i < numbersOfGroups; i++) {
            int numbersOfPeople = Integer.parseInt(scanner.nextLine());

            if (numbersOfPeople <= 5) {
                countMusala += numbersOfPeople;

            } else if (numbersOfPeople <= 12) {

                countMonblan += numbersOfPeople;

            } else if (numbersOfPeople <= 25) {
                countKilimandjaro += numbersOfPeople;

            } else if (numbersOfPeople <= 40) {
                countK2 += numbersOfPeople;

            } else {
                countEverest += numbersOfPeople;
            }


        }

        totalPeople = countMusala + countMonblan + countKilimandjaro + countK2 + countEverest;

        double percentageMusala = countMusala * 1.0 / totalPeople * 100;
        double percentageMonblan = countMonblan * 1.0 / totalPeople * 100;
        double percentageKilimandjaro = countKilimandjaro * 1.0 / totalPeople * 100;
        double percentageK2 = countK2 * 1.0 / totalPeople * 100;
        double percentageEverest = countEverest * 1.0 / totalPeople * 100;

        System.out.printf("%.2f%%%n", percentageMusala);
        System.out.printf("%.2f%%%n", percentageMonblan);
        System.out.printf("%.2f%%%n", percentageKilimandjaro);
        System.out.printf("%.2f%%%n", percentageK2);
        System.out.printf("%.2f%%%n", percentageEverest);

    }
}
