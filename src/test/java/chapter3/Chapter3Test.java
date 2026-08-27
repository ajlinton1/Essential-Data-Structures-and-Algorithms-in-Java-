package chapter3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Chapter3Test {

    @Test
    public void testExercise1() {
        /*
        Input: "search(summarize(read_file(config.yaml)))"
        Output: ["read_file(config.yaml)",
        "summarize(read_file(config.yaml))",
        "search(summarize(read_file(config.yaml)))"]
         */
        ExecutionOrder executionOrder = new ExecutionOrder();
        String expression = "search(summarize(read_file(config.yaml)))";
        var result = executionOrder.getExecutionOrder(expression);
        assertEquals("read_file(config.yaml)", result.get(1));
        assertEquals("summarize(read_file(config.yaml))", result.get(2));
        assertEquals("search(summarize(read_file(config.yaml)))", result.get(3));
    }

    @Test
    public void testExercise2() {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(7);
        minStack.push(3);
        assertEquals(3, minStack.getMin());
        minStack.pop();
        assertEquals(5, minStack.getMin());
    }

    @Test
    public void testExercise3() {
        QueueUsingTwoStacks<Integer> queueUsingTwoStacks = new QueueUsingTwoStacks<>();
        queueUsingTwoStacks.enqueue(5);
        queueUsingTwoStacks.enqueue(7);
        queueUsingTwoStacks.enqueue(3);
        assertEquals(5, queueUsingTwoStacks.peek());
        queueUsingTwoStacks.dequeue();
        assertEquals(7, queueUsingTwoStacks.peek());
        queueUsingTwoStacks.dequeue();
        assertEquals(3, queueUsingTwoStacks.peek());
    }
}
