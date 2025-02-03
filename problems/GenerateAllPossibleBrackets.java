package februalry2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateAllPossibleBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете n: ");
        int n = scanner.nextInt();

        List<String> result = new ArrayList<>();
        generateParentheses(n, 0, 0, "", result);

        System.out.println("Възможни комбинации:");
        for (String combination : result) {
            System.out.println(combination);
        }
    }

    public static void generateParentheses(int n, int open, int close, String current, List<String> result) {
        // Ако сме използвали всички скоби -> добавяме резултата
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        // Добавяме "(" ако има останали отварящи скоби
        if (open < n) {
            generateParentheses(n, open + 1, close, current + "(", result);
        }

        // Добавяме ")" ако има валидно затваряне
        if (close < open) {
            generateParentheses(n, open, close + 1, current + ")", result);
        }
    }
}