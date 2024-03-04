import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int arrivedHour = Integer.parseInt(scanner.nextLine());
        int arrivedMinutes = Integer.parseInt(scanner.nextLine());

        int allMinOfExam = hour * 60 + minutes;
        int allMinOfArrive = arrivedHour * 60 + arrivedMinutes;

        int difference = Math.abs(allMinOfExam - allMinOfArrive);

        int diffHour = difference / 60;
        int diffMin = difference % 60;

        if (allMinOfArrive > allMinOfExam) {
            System.out.println("Late");
            if (diffHour == 0) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                System.out.printf("%d:%02d hours after the start", diffHour, diffMin);
            }
        } else if (allMinOfExam == allMinOfArrive || difference <= 30) {

            System.out.println("On time");
            if (difference != 0) {
                System.out.printf("%d minutes before the start", diffMin);
            }
        } else {
            System.out.println("Early");
            if (diffHour == 0) {
                System.out.printf("%d minutes before the start", diffMin);
            } else {
                System.out.printf("%d:%02d hours before the start", diffHour, diffMin);

            }
        }
    }
}
