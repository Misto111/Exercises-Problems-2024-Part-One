import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        switch (typeFlowers) {
            case "Roses":

                sum = numFlowers * 5;

                if (numFlowers > 80) {
                    sum = sum - (sum * 0.1);
                }
                break;
            case "Dahlias":

                sum = numFlowers * 3.8;

                if (numFlowers > 90) {

                    sum = sum - (sum * 0.15);
                }
                break;
            case "Tulips":

                sum = numFlowers * 2.8;

                if (numFlowers > 80)  {

                    sum = sum - (sum * 0.15);
                }
                break;
            case "Narcissus":

                sum = numFlowers * 3;

                if (numFlowers < 120) {

                    sum = sum + (sum * 0.15);
                }
                break;
            case "Gladiolus":

                sum = numFlowers * 2.5;

                if (numFlowers < 80) {

                    sum = sum + (sum * 0.2);
                }
                break;
        }

        if (sum <= budget) {
            double difference = budget - sum;

            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, Math.abs(difference));
        }else {
            double difference = sum - budget;

            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(difference));
        }


    }
}
