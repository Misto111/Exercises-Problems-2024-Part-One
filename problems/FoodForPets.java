
import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());


        double totalEatenFood = 0;
        double allBiscuit = 0;
        double allFoodOfDog = 0;
        double allFoodOfCat = 0;

        for (int i = 1; i <= days; i++) {

            int foodOfDog = Integer.parseInt(scanner.nextLine());
            int foodOfCat = Integer.parseInt(scanner.nextLine());

            int foodPerDay = foodOfCat + foodOfDog;

            if (i % 3 == 0) {

                allBiscuit += 0.1 * foodPerDay;

            }

            totalEatenFood += foodPerDay;

            allFoodOfDog += foodOfDog;
            allFoodOfCat += foodOfCat;






        }
        double percentageTotalEatenFood = (totalEatenFood / totalFood) * 100;
        double percentageTotalEatenDog = (allFoodOfDog / totalEatenFood) * 100;
        double percentageTotalEatenCat = (allFoodOfCat / totalEatenFood) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", allBiscuit);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageTotalEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageTotalEatenDog);
        System.out.printf("%.2f%% eaten from the cat.", percentageTotalEatenCat);


    }
}
