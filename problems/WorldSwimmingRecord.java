import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double swimmingRecordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInM = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double allSecond = distanceInM * timeInSec;

        double delay = distanceInM / 15;
        double totalDelay = Math.floor(delay) * 12.5;

        double totalTime = allSecond + totalDelay;

        if (totalTime < swimmingRecordInSec) {


            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else {

            double difference = swimmingRecordInSec - totalTime;
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(difference));
        }



    }
}
