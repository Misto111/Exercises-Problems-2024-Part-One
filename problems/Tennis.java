package cycles;

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int winPoints = 0;
        int winCount = 0;

        for (int i = 0; i < tournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    winPoints += 2000;
                    winCount++;
                    break;
                case "F":
                    winPoints += 1200;
                    break;
                case "SF":
                    winPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d%n", winPoints + startPoints);
        System.out.printf("Average points: %d%n", winPoints / tournaments);

        double percentageWins = winCount * 1.0 / tournaments * 100;
        System.out.printf("%.2f%%%n", percentageWins);
    }
}
