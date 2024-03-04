import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int walkingCount = 0;
        int target = 10000;
        String command = scanner.nextLine();

        while (!command.equals("Going home")) {
            int walkingSteps = Integer.parseInt(command);

            walkingCount += walkingSteps;

            if (walkingCount >= target) {
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("Going home")) {
            int homeSteps = Integer.parseInt(scanner.nextLine());

            walkingCount += homeSteps;

        }

            if (walkingCount >= target) {
                int difference = walkingCount - target;

                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", difference);



            }else {

                int difference = Math.abs(target - walkingCount) ;

                System.out.printf("%d more steps to reach goal.", difference);

            }
        }
    }

