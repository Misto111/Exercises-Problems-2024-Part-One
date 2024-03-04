import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double sumPerDay = 0;
        double totalSum = 0;

        switch (season){
            case "Winter":
                if (destination.equals("Dubai")){
                    sumPerDay = days * 45000;
                } else if (destination.equals("Sofia")) {
                    sumPerDay = days * 17000;

                } else if (destination.equals("London")) {
                    sumPerDay = days * 24000;
                }
                break;
            case "Summer":
                if (destination.equals("Dubai")){
                    sumPerDay = days * 40000;
                } else if (destination.equals("Sofia")) {
                    sumPerDay = days * 12500;

                } else if (destination.equals("London")) {
                    sumPerDay = days * 20250;
                }
                break;
        }
        totalSum = sumPerDay;

        if (destination.equals("Dubai")) {
            totalSum = totalSum - (totalSum* 0.3);

        } else if (destination.equals("Sofia")) {

            totalSum = totalSum + (totalSum * 0.25);
        }
        if (budget >= totalSum) {

            double difference = Math.abs(budget - totalSum);

            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", difference);

        }else {
                double difference = Math.abs(totalSum - budget);
            System.out.printf("The director needs %.2f leva more!", difference);
    }
}
}