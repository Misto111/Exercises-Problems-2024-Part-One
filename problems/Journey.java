import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double sum = 0;
        String destination = "";
        String place = "";

        if (budget <= 100) {

           destination = "Bulgaria";

            switch (season){
                case "summer":
                    sum = budget * 0.3;
                    place = "Camp";
                    break;
                case "winter":
                    sum = budget * 0.7;
                    place = "Hotel";
                    break;
            }
        } else if (budget <= 1000) {

            destination = "Balkans";

            switch (season) {
                case "summer":
                    sum = budget * 0.4;
                    place = "Camp";
                break;
                case "winter":
                    sum = budget * 0.8;
                    place = "Hotel";
                    break;
            }

        } else if (budget > 1000) {

            destination = "Europe";
            sum = budget * 0.9;

            place = "Hotel";

        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", place, sum);


    }

}
