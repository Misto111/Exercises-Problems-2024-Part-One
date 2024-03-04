import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForExcursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = puzzles * 2.6;
        double talkingDollsPrice = talkingDolls * 3;
        double teddyBearsPrice = teddyBears * 4.1;
        double minionsPrice = minions * 8.2;
        double trucksPrice = trucks * 2;

        double totalPrice = puzzlesPrice + talkingDollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        int numbersOfToys = puzzles + talkingDolls + teddyBears + minions + trucks;

        if (numbersOfToys >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.25);

        }

        double total = totalPrice - (totalPrice * 0.1);

        if (total >= priceForExcursion) {
             double difference = total - priceForExcursion;
            System.out.printf("Yes! %.2f lv left.", difference);
        }else {

            double difference = priceForExcursion - total;
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }

    }



}
