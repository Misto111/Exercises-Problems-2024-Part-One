package factoryDP;

import java.util.Scanner;

public class CakeFactory {

    public static Cake createCake() {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Cake cake = null;
        switch (input) {
            case "carrot":
                cake = new Cake(40, 45.6, 24, input);
                actionForDelivery(cake);
                break;
            case "fruits":
                cake = new Cake(50, 50, 24, input);
                actionForDelivery(cake);
                break;
        }

        return cake;
    }

    private static void actionForDelivery(Cake cake) {
        cake.prepare();
        cake.bake();
        cake.box();
    }

}
