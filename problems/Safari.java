import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numOfOvernights = Integer.parseInt(scanner.nextLine());
        double overnightPrice = Double.parseDouble(scanner.nextLine());
        int percentForExpenses = Integer.parseInt(scanner.nextLine());

       // double totalSumOfOvernights = overnightPrice * numOfOvernights;

        double totalBudgetWithExpenses = budget * (percentForExpenses/100.0);

       // double total = totalBudgetWithExpenses + totalSumOfOvernights;



        if (numOfOvernights >= 7) {

            overnightPrice = overnightPrice - (overnightPrice * 0.05);

        }
        double totalSumOfOvernights = overnightPrice * numOfOvernights;
        double total = totalBudgetWithExpenses + totalSumOfOvernights;
        if (budget >= total) {

            double difference = Math.abs(budget - total);
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", difference);
        }else {

            double difference = Math.abs(total - budget);
            System.out.printf("%.2f leva needed.", difference);
        }



    }
}
