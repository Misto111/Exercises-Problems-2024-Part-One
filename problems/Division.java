import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        int divisibleNum = 0;

        if (num % 10 == 0) {
            divisibleNum = 10;

        } else if (num % 7 == 0) {
            divisibleNum = 7;

        } else if (num % 6 == 0) {
            divisibleNum = 6;

        } else if (num % 3 == 0) {
            divisibleNum = 3;

        } else if (num % 2 == 0) {
            divisibleNum = 2;
        }

        if (divisibleNum == 0) {
            System.out.println("Not divisible");
        } else {

            System.out.printf("The number is divisible by %d", divisibleNum);

        }
    }
}
