package chapter2;

import static java.util.Collections.reverse;

public class ArrayRotation {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    private void reverse(int[] nums, int i, int i1) {
        while (i < i1) {
            int temp = nums[i];
            nums[i] = nums[i1];
            nums[i1] = temp;
            i++;
            i1--;
        }
    }
}
