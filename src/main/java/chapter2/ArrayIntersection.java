package chapter2;

public class ArrayIntersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numberFound = new int[1001];
        for (int num : nums1) {
            numberFound[num]++;
        }
        int p = 0;
        for (int num : nums2) {
            if (numberFound[num] > 0) {
                nums1[p++] = num;
                numberFound[num]--;
            }
        }
        int[] result = new int[p];
        System.arraycopy(nums1, 0, result, 0, p);
        return result;
    }
}
