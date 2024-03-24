package stackOfStrings;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(new ArrayDeque<>());

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
