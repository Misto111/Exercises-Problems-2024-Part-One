import java.util.Scanner;

public class FishingBoat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int budget = Integer.parseInt(scanner.nextLine());
            String season = scanner.nextLine();
            int numFishingBoats = Integer.parseInt(scanner.nextLine());

            double shipPrice = 0;
            double total = 0;

            switch (season) {
                case "Spring":

                    shipPrice = 3000;
                    total = checkingPeople(numFishingBoats, shipPrice, total);
                    if (numFishingBoats % 2 == 0){
                        total = total - (total * 0.05);
                    }
                    break;
                case "Summer":
                    shipPrice = 4200;
                    total = checkingPeople(numFishingBoats, shipPrice, total);
                    if (numFishingBoats % 2 == 0){
                        total = total - (total * 0.05);
                    }
                    break;
                case "Autumn":
                    shipPrice = 4200;
                    total = checkingPeople(numFishingBoats, shipPrice, total);
                    break;
                case "Winter":
                    shipPrice = 2600;
                    total = checkingPeople(numFishingBoats, shipPrice, total);
                    if (numFishingBoats % 2 == 0){
                        total = total - (total * 0.05);
                    }
                    break;

            }
            if (budget >= total) {

                double difference = budget - total;

                System.out.printf("Yes! You have %.2f leva left.", Math.abs(difference));
            }else {

                double difference = total - budget;

                System.out.printf("Not enough money! You need %.2f leva.", Math.abs(difference));
            }


        }

        public static double checkingPeople(int numFishingBoats, double shipPrice, double total) {
            boolean peopleCaseOne = numFishingBoats <= 6;
            boolean peopleCaseTwo = numFishingBoats >= 7 && numFishingBoats <=11;
            boolean peopleCaseThree = numFishingBoats > 12;

               total = shipPrice;


            if (peopleCaseOne) {
                total = total - (total * 0.1);
            } else if (peopleCaseTwo) {

                total = total - (total * 0.15);
            } else if (peopleCaseThree) {

                total = total - (total * 0.25);
            }

            return total;
        }

    }

