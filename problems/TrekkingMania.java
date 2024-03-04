import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfGroups = Integer.parseInt(scanner.nextLine());


        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;




        for (int i = 0; i < numOfGroups; i++) {

            int groups = Integer.parseInt(scanner.nextLine());

            if (groups <= 5) {
                one += groups;

            } else if (groups <= 12) {
                two += groups;


            } else if (groups <= 25) {
                three += groups;


            } else if (groups <= 40) {
                four += groups;


            } else {
                five += groups;


            }

        }

        double sum = one  + two + three + four + five;

        double musala = one / sum * 100;
        double monblan = two / sum * 100;
        double kilimandjaro = three / sum * 100;
        double k2 = four / sum * 100;
        double everest = five / sum * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", musala, monblan, kilimandjaro, k2, everest);
    }
}
