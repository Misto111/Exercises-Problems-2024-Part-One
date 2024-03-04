import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        double sum = 0;
        int moneyCount = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                if (i == 2) {
                    sum = 10.00;
                } else {
                    sum += 10.00 * i /2;
                }
                moneyCount ++;

            }else {
                toysCount ++;

            }

        }
        double toysTotalPrice = toyPrice * toysCount;
        double totalSum = (sum - moneyCount) + toysTotalPrice;


        if (totalSum >= washMachinePrice) {

            double difference = Math.abs(totalSum- washMachinePrice);

            System.out.printf("Yes! %.2f", difference);
        }else {

            double difference = Math.abs(washMachinePrice - totalSum);

            System.out.printf("No! %.2f", difference);
        }

    }
}
