import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double instead = Double.parseDouble(scanner.nextLine());

        double change = instead * 100;
          int count = 0;

          while (change > 0) {
              if (change >= 200) {

                  change -= 200;
                  count++;
              } else if (change >= 100) {
                  change -= 100;
                  count++;
              } else if (change >= 50) {
                  change -= 50;
                  count++;
              } else if (change >= 20) {
                  change -= 20;
                  count++;
              } else if (change >= 10) {
                  change -= 10;
                  count++;
              } else if (change >= 5) {
                  change -= 5;
                  count++;
              } else if (change >= 2) {
                  change -= 2;
                  count++;
              } else if (change >= 1) {
                  change -= 1;
                  count ++;

              }else {
                  break;
              }

          }
        System.out.println(count);

    }
}
