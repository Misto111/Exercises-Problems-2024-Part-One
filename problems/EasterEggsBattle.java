import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int onePlayerEggs = Integer.parseInt(scanner.nextLine());
        int twoPlayerEggs = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("End")) {



          if (command.equals("one")) {
              twoPlayerEggs--;

          } else if (command.equals("two")) {
              onePlayerEggs--;

          }
          if (onePlayerEggs <= 0 || twoPlayerEggs <=0){
              break;
          }
            command = scanner.nextLine();
        }

        if (onePlayerEggs <= 0) {



            System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", twoPlayerEggs);
        } else if (twoPlayerEggs <= 0) {

            System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", onePlayerEggs);

        } else {
            System.out.printf("Player one has %d eggs left.%n", onePlayerEggs);
            System.out.printf("Player two has %d eggs left.%n", twoPlayerEggs);
            }



        }
    }

