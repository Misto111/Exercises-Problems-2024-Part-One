import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badEvaluation = Integer.parseInt(scanner.nextLine());

        String taskName = scanner.nextLine();
       // int evaluate = Integer.parseInt(scanner.nextLine());

        int badEvaluationsCount = 0;
        int totalEvaluateCount = 0;
        int evaluateSum = 0;
        int taskCount = 0;
        String lastTask = "";

        while (!taskName.equals("Enough")) {
            int evaluate = Integer.parseInt(scanner.nextLine());
            lastTask = taskName;

            if (evaluate <= 4) {
                badEvaluationsCount++;

                if (badEvaluationsCount == badEvaluation) {
                    System.out.printf("You need a break, %d poor grades.", badEvaluationsCount);
                    break;

                }


            }
            taskName = scanner.nextLine();

            totalEvaluateCount++;
            evaluateSum += evaluate;
            taskCount++;


        }
            if (taskName.equals("Enough")) {

                double average = (evaluateSum * 1.0) /totalEvaluateCount;

                System.out.printf("Average score: %.2f%n", average);
                System.out.printf("Number of problems: %d%n", taskCount);
                System.out.printf("Last problem: %s", lastTask);
            }

        }

    }
