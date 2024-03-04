import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        //double sum = deposit + term * ((deposit * (percent / 100))/12);

        double increase = deposit * (percent / 100);
        double percentPerMonth = increase / 12;
        double sum = deposit + term * percentPerMonth;


        System.out.println(sum);
    }
}
