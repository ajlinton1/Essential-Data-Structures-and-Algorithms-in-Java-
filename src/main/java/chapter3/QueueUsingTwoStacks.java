package chapter3;

public class QueueUsingTwoStacks<T> {

    Stack<T> inbox = new Stack<>();
    Stack<T> outbox = new Stack<>();

    public void enqueue(T value) {
        inbox.push(value);
    }

    // enqueue, dequeue, peek, isEmpty.

    public T dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

    public T peek() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.peek();
    }

    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
}
