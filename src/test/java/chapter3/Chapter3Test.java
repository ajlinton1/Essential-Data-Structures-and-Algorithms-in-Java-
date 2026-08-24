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
}
