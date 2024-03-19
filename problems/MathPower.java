import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(printPoweredNumber(num, power));


    }

    private static double printPoweredNumber(double num, int power) {

        return Math.pow(num, power);
    }
}
