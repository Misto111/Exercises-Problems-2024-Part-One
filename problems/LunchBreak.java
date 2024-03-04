import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int timePerEpisode = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double timeForLunch = breakTime * 0.125;
        double timeForRecreation = breakTime * 0.25;

        double totalTime = timePerEpisode + timeForLunch + timeForRecreation;
        double timeLeft = Math.abs(breakTime - totalTime);


        if (breakTime >= totalTime) {

            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(timeLeft));

        }else {

            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(timeLeft));
        }


    }
}
