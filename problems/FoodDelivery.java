import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.4;
        double veganPrice = veganMenu * 8.15;

        double menusPrice = chickenPrice + fishPrice + veganPrice;
        double desertPrice = menusPrice * 0.2;

        double total = menusPrice + desertPrice + 2.5;

        System.out.println(total);
    }
}
