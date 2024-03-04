import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int numOfEvaluate = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= numOfEvaluate; i++) {

            String nameOfEvaluate = scanner.nextLine();
            double pointsFromEvaluate = Double.parseDouble(scanner.nextLine());

            double totalPointsFromEvaluate = nameOfEvaluate.length() * (pointsFromEvaluate / 2);

            points += totalPointsFromEvaluate;

            if (points >= 1250.5) {

                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);

               break;
            }

        }
        if (points < 1250.5) {
            double diff = Math.abs(1250.5 - points);
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }

    }

}
