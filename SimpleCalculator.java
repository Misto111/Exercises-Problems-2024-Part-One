import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");

        Deque<String> tokens = new ArrayDeque<>();
        Collections.addAll(tokens, input);


        while (tokens.size() > 1) {

            int firstNum = Integer.parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNum = Integer.parseInt(tokens.pop());


            int result = 0;
            if (operator.equals("+")) {

                 result = firstNum + secondNum;

            } else if (operator.equals("-")) {

                 result = firstNum - secondNum;

            }
            tokens.push(String.valueOf(result));
        }
        System.out.println(tokens.peek());
    }
}
