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

    @Test
    public void testExercise3() {
//        Input: list1 = [1,2,4], list2 = [1,3,4] → Output: [1,1,2,3,4,4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode mergedList = new MergeSortedLists().mergeTwoLists(list1, list2);
        assertEquals(1, mergedList.val);
        assertEquals(1, mergedList.next.val);
        assertEquals(2, mergedList.next.next.val);
        assertEquals(3, mergedList.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.next.val);
        assertEquals(null, mergedList.next.next.next.next.next.next);
//        Input: list1 = [], list2 = [] → Output: []
    }

    @Test
    public void testExercise4() {
        ArrayRotation arrayRotation = new ArrayRotation();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        arrayRotation.rotate(nums, k);
        assertEquals(4, nums[0]);
        assertEquals(5, nums[1]);
        assertEquals(1, nums[2]);
        assertEquals(2, nums[3]);
        assertEquals(3, nums[4]);
    }

    @Test
    public void testExercise5() {
        RemoveElements removeElements = new RemoveElements();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
        int val = 6;
        ListNode result = removeElements.removeElements(head, val);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
        assertEquals(null, result.next.next.next.next.next);
    }

    @Test
    public void testExercise6() {
        MiddleNodeFinder middleNodeFinder = new MiddleNodeFinder();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode result = middleNodeFinder.middleNode(head);
        assertEquals(3, result.val);
    }

    @Test
    public void testExercise7() {
        /*
        Input: [‑2,1,‑3,4,‑1,2,1,‑5,4] → Output: 6 (subarray [4,‑1,2,1])
        Input: [1] → Output: 1
        */
        MaxSubarray maxSubarray = new MaxSubarray();
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxSubarray.maxSubArray(nums1);
        assertEquals(6, result1);

        int[] nums2 = {1};
        int result2 = maxSubarray.maxSubArray(nums2);
        assertEquals(1, result2);
    }

    @Test
    public void testExercise8() {
        /*
        Input: nums1 = [1,2,2,1], nums2 = [2,2] → Output: [2,2]
        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] → Output: [4,9]
        */
        ArrayIntersection arrayIntersection = new ArrayIntersection();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = arrayIntersection.intersect(nums1, nums2);
        assertEquals(2, result1.length);
        assertEquals(2, result1[0]);
        assertEquals(2, result1[1]);
    }
}