import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double wearPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        double allWearPrice = wearPrice * statists;

        if (statists > 150) {
            allWearPrice = allWearPrice - (allWearPrice * 0.1);
        }
           double wearPlusDecor = allWearPrice + decor;
        if (wearPlusDecor > budget) {

            double difference = wearPlusDecor - budget;

            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {

            double difference = budget - wearPlusDecor;

            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }

    }
}
