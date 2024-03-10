import java.util.Arrays;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

           if (day == 1) {
               System.out.println(days[0]);
           } else if (day == 2) {
               System.out.println(days[1]);
           } else if (day == 3) {
               System.out.println(days[2]);

           } else if (day == 4) {
               System.out.println(days[3]);

           } else if (day == 5) {
               System.out.println(days[4]);

           }else if (day == 6) {
               System.out.println(days[5]);

           }else if (day == 7) {
               System.out.println(days[6]);

           }else {
               System.out.println("Invalid day!");
           }
    }
}
