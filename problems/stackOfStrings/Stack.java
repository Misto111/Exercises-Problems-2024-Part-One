package stackOfStrings;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Stack {
    private ArrayDeque<String> stack;

    public Stack(ArrayDeque<String> stack) {
        this.stack = stack;
    }

    public void push(String item) {

        this.stack.push(item);
    }

    public String pop() {

        return this.stack.pop();
    }

    public String peek() {

        return this.stack.peek();
    }

    public boolean isEmpty() {

        return this.stack.isEmpty();
    }
}
