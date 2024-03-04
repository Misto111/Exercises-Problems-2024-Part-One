import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        int allMin = (hour * 60) + minutes + 15;

        int currentHour = allMin / 60;

        int currentMinutes = allMin % 60;

        //System.out.printf("%d:0%d", currentHour, currentMinutes);

        if (currentHour > 23) {
            currentHour = 0;


            System.out.printf("%d:%02d", currentHour, currentMinutes);

        }else {
            System.out.printf("%d:%02d", currentHour, currentMinutes);
        }

    }
}
