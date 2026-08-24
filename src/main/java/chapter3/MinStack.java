package chapter3;

public class MinStack {

    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = stack.pop();
        if (value == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }
}
