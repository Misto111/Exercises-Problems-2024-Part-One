package februalry2025;

import java.util.*;
import java.util.stream.Collectors;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> brackets = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        boolean isBalanced = true;

        for (int i = 0; i < brackets.size(); i++) {
            if (brackets.get(i).equals("(")) {
                queue.offer(brackets.get(i));
            } else if (brackets.get(i).equals(")")) {
                stack.push(brackets.get(i));

            } else if (brackets.get(i).equals("{")) {
                queue.offer(brackets.get(i));

            } else if (brackets.get(i).equals("}")) {
                stack.push(brackets.get(i));

            }else if (brackets.get(i).equals("[")) {
                queue.offer(brackets.get(i));

            } else if (brackets.get(i).equals("]")) {
                stack.push(brackets.get(i));

            }
        }

        if (queue.size() != stack.size()) {
            isBalanced = false;
            System.out.println("No balanced brackets");
            return;
        }

        for (int i = 0; i < queue.size(); i++) {
            if (queue.peek().equals("(") && stack.peek().equals(")")) {
                continue;
            } else if (queue.peek().equals("{") && stack.peek().equals("}")) {
                continue;
            } else if (queue.peek().equals("[") && stack.peek().equals("]")) {
                continue;
            } else {
                isBalanced = false;
                break;
            }

        }

        if (isBalanced) {
            System.out.print(String.join("", queue));
            System.out.print(String.join("", stack));

        }

        System.out.println();

        System.out.println(isBalanced ? "Yes" : "No");
    }
}
