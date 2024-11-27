package cycles;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int numberOfJury = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0;

        for (int i = 1; i <= numberOfJury; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            String nameWithoutSpaces = juryName.replace(" ", "");

            //int nameLength = nameWithoutSpaces.length();
            double allJuryPoints = juryName.length() * (juryPoints / 2);

            points += allJuryPoints;

            //totalPoints += allJuryPoints;

            if (points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!", actorName, (1250.5 - points));
    }
}
