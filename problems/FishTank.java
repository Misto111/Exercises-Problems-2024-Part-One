import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeConvertToLiters = volume/1000;

        double neededWater = volumeConvertToLiters - (volumeConvertToLiters * (percent/100));

        System.out.println(neededWater);
    }
}
