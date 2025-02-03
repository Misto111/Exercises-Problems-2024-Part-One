package februalry2025;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        //String numText = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                //numText += i + " ";
                stringBuilder.append(i).append(" ");
        }

        }
        System.out.println(number + " = " + stringBuilder);
    }
}
