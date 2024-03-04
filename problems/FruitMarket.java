import java.util.Scanner;

public class FruitMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double numOfBananas = Double.parseDouble(scanner.nextLine());
        double numOfOranges = Double.parseDouble(scanner.nextLine());
        double numOfRaspberries = Double.parseDouble(scanner.nextLine());
        double numOfStrawberries = Double.parseDouble(scanner.nextLine());

        double raspberriesTotalPrice =   strawberryPrice * 0.5;
        double orangeTotalPrice = raspberriesTotalPrice - (raspberriesTotalPrice * 0.4);
        double bananasTotalPrice = raspberriesTotalPrice - (raspberriesTotalPrice * 0.8);


        double totalRaspberries = raspberriesTotalPrice * numOfRaspberries;
        double totalOranges = orangeTotalPrice * numOfOranges;
        double totalBananas = bananasTotalPrice * numOfBananas;
        double totalStrawberries = numOfStrawberries * strawberryPrice;

        double totalSum = totalRaspberries + totalOranges + totalBananas + totalStrawberries;


        System.out.printf("%.2f", totalSum);



    }

}
