import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int feePerYear = Integer.parseInt(scanner.nextLine());

        double basketballSneakers = feePerYear - (feePerYear * 0.4);
        double basketballWear = basketballSneakers - (basketballSneakers * 0.2);
        double basketballBall = basketballWear * 0.25;
        double basketballAccessories = basketballBall * 0.2;

        double expenses = basketballSneakers + basketballWear + basketballBall + basketballAccessories + feePerYear;

        System.out.println(expenses);


    }
}
