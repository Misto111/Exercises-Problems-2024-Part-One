import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> allNumbersLittleThan200 = new ArrayList<>();
        List<Integer> allNumbersFrom200To399 = new ArrayList<>();
        List<Integer> allNumbersFrom400to599 = new ArrayList<>();
        List<Integer> allNumbersFrom600To799 = new ArrayList<>();
        List<Integer> allNumbersFrom800 = new ArrayList<>();

        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;
        double sum5 = 0;

        for (int i = 1; i <= n ; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            allNumbers.add(num);

        }

        for (int i = 0; i < allNumbers.size(); i++) {

            if (allNumbers.get(i) < 200) {
                  allNumbersLittleThan200.add(i);
            } else if (allNumbers.get(i) >= 200 && allNumbers.get(i) < 400) {

                allNumbersFrom200To399.add(i);

            } else if (allNumbers.get(i) >= 400 && allNumbers.get(i) < 600) {

                allNumbersFrom400to599.add(i);

            } else if (allNumbers.get(i) >= 600 && allNumbers.get(i) < 800) {

                allNumbersFrom600To799.add(i);

            } else if (allNumbers.get(i) >= 800) {

                allNumbersFrom800.add(i);

            }

            sum1 = allNumbersLittleThan200.size() / (n * 1.0) * 100;
            sum2 = allNumbersFrom200To399.size() / (n * 1.0) * 100;
            sum3 = allNumbersFrom400to599.size() / (n * 1.0) * 100;
            sum4 = allNumbersFrom600To799.size() / (n * 1.0) * 100;
            sum5 = allNumbersFrom800.size() / (n * 1.0) * 100;


        }

        System.out.printf("%.2f%%%n", sum1);
        System.out.printf("%.2f%%%n", sum2);
        System.out.printf("%.2f%%%n", sum3);
        System.out.printf("%.2f%%%n", sum4);
        System.out.printf("%.2f%%%n", sum5);



    }
}
