import java.util.Iterator;
import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int addedPoints = 0;
        int winCount = 0;

        for (int i = 0; i < tournaments; i++) {

            String stage = scanner.nextLine();

            if (stage.equals("W")) {

                addedPoints += 2000;
                winCount++;
            } else if (stage.equals("F")) {

                addedPoints += 1200;

            } else if (stage.equals("SF")) {
                addedPoints += 720;

            }

        }
        int totalPoints = addedPoints + startPoints;
        int middlePoints = addedPoints / tournaments;
        double percentForTournaments = ((winCount * 1.0) / tournaments) * 100;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", middlePoints);
        System.out.printf("%.2f%%", percentForTournaments);




    }
}
