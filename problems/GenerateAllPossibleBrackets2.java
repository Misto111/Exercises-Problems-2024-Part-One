package februalry2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class GenerateAllPossibleBrackets2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете n: ");
        int n = scanner.nextInt();

        List<String> result = new ArrayList<>();
        Stack<String[]> stack = new Stack<>();

        // Начално състояние: ("", 0 отворени, 0 затворени)
        stack.push(new String[]{"", "0", "0"});

        while (!stack.isEmpty()) {
            String[] state = stack.pop();
            String current = state[0];
            int open = Integer.parseInt(state[1]);
            int close = Integer.parseInt(state[2]);

            // Ако сме завършили валидна комбинация
            if (current.length() == n * 2) {
                result.add(current);
                continue;
            }

            // Добавяме "(" ако можем
            if (open < n) {
                stack.push(new String[]{current + "(", String.valueOf(open + 1), String.valueOf(close)});
            }

            // Добавяме ")" ако имаме повече отворени скоби
            if (close < open) {
                stack.push(new String[]{current + ")", String.valueOf(open), String.valueOf(close + 1)});
            }
        }

        // Принтираме резултата
        System.out.println("Възможни комбинации:");
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}