import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int numOfPeople = rows * cols;

        double income = 0;

        switch (type) {
            case "Premiere":
                income = numOfPeople * 12;
                break;
            case "Normal":
                income = numOfPeople * 7.5;
                break;
            case "Discount":
                income = numOfPeople * 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
