import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemories = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250;
        double processorsPrice = processors * (videoCardsPrice * 0.35);
        double ramMemoriesPrice =  ramMemories * (videoCardsPrice * 0.1);

        double sum = videoCardsPrice + processorsPrice + ramMemoriesPrice;

        if (videoCards > processors) {

            sum = sum - (sum * 0.15);
        }

        if (budget >= sum) {
            double difference = budget - sum;

            System.out.printf("You have %.2f leva left!", difference);
        }else {
            double difference = sum - budget;

            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}
