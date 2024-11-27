package cycles;

import java.util.Scanner;

public class TheSmartLili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int birthdaySum = 0;
        int toysCount = 0;
        int addingSumUp = 10;
        int toysTotalPrice = 0;

        for (int i = 1; i <= age; i++) {
            if (i == 2) {

                birthdaySum += addingSumUp;
                birthdaySum -= 1;

            } else if (i % 2 == 0) {

                addingSumUp += 10;
                birthdaySum += addingSumUp;
                birthdaySum -= 1;

            } else {

                toysCount++;
            }
        }
        toysTotalPrice = toysCount * toyPrice;

        birthdaySum += toysTotalPrice;

        double difference = Math.abs(birthdaySum - washingMachinePrice);

        if (birthdaySum >= washingMachinePrice) {

            System.out.printf("Yes! %.2f", difference);
        } else {

            System.out.printf("No! %.2f", difference);
        }

    }
}
