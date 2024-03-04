import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededSum = Double.parseDouble(scanner.nextLine());
        double availableSum = Double.parseDouble(scanner.nextLine());


        double totalSum = availableSum;

        int spendCount = 0;
        int totalCount = 0;

        boolean isFailed = false;

        while (totalSum < neededSum) {

            if (spendCount >= 5) {
                isFailed = true;
                break;
            }
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());

            totalCount++;


            if (action.equals("spend")) {
                spendCount++;
                totalSum -= sum;
                if (totalSum < 0) {
                    totalSum = 0;

                }

            } else if (action.equals("save")) {

                spendCount = 0;

                totalSum += sum;
            }
        }

        if (isFailed) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", totalCount);
        } else {
                System.out.printf("You saved the money for %d days.", totalCount);
            }
        }

    }





