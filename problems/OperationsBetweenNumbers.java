import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double sum = 0;
        String kind = "";

        if (operator.equals("+")) {

            sum = n1 + n2;

        } else if (operator.equals("-")) {
            sum = n1 - n2;

        } else if (operator.equals("*")) {
            sum = n1 * n2;

        } else if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
                return;
            } else if (n1 == 0) {
                System.out.printf("Cannot divide %d by zero", n2);
                return;
        } else {
                sum = n1 / (n2 * 1.00);
            }

        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
                return;
            }else if (n1 == 0){

                System.out.printf("Cannot divide %d by zero", n2);
                return;
            } else {
                sum = n1 % n2;
            }
        }
        if (sum % 2 == 0) {
            kind = "even";
        } else {
            kind = "odd";
        }

        if (operator.equals("/")) {
            if (n1 == n2) {
                System.out.printf("%d %s %d = %.0f", n1, operator, n2, sum);
            }else {

                System.out.printf("%d %s %d = %.2f", n1, operator, n2, sum);

            }

    } else if (operator.equals("%")) {

            System.out.printf("%d %s %d = %.0f", n1, operator, n2, sum);



    }else {
            System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, sum, kind);
        }

}
}
