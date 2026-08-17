package chapter2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Chapter2Test {

    @Test
    public void testExercise1() {
        TokenWindow window = new TokenWindow(4);
        window.append("The");
        window.append("agent");
        window.append("processes");
        window.append("input");
        var result = window.getWindow(); // ["The", "agent", "processes", "input"]
        assertEquals(4, result.size());
        assertEquals("The", result.get(0));
        assertEquals("agent", result.get(1));
        assertEquals("processes", result.get(2));
        assertEquals("input", result.get(3));
        window.append("tokens");
        result = window.getWindow(); // ["agent", "processes", "input", "tokens"]
        assertEquals(4, result.size());
        assertEquals("agent", result.get(0));
        assertEquals("processes", result.get(1));
        assertEquals("input", result.get(2));
        assertEquals("tokens", result.get(3));
    }

    @Test
    public void testExercise2() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5};
        int newLength = removeDuplicates.removeDuplicates(nums);
        assertEquals(5, newLength);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(4, nums[3]);
        assertEquals(5, nums[4]);
    }
}
