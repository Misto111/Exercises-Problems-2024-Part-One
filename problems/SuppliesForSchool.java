import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPens = Integer.parseInt(scanner.nextLine());
        int numOfMarkers = Integer.parseInt(scanner.nextLine());
        int litersOfCleaningDetergent = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pensPrice = numOfPens * 5.80;
        double markersPrice = numOfMarkers * 7.20;
        double cleaningDetergentPrice = litersOfCleaningDetergent * 1.20;

        double total = pensPrice + markersPrice + cleaningDetergentPrice;
        double totalPriceWithPercentage = total - (total * (percent / 100.0));

        System.out.println(totalPriceWithPercentage);

    }
}
