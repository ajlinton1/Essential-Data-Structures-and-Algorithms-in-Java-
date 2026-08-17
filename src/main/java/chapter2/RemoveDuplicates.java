package chapter2;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums){
        int[] numberFound = new int[201];
        for (int num : nums) {
            numberFound[num + 100]++;
        }
        int p = 0;
        for (var i=0; i<numberFound.length; i++){
            if (numberFound[i] > 0){
                nums[p++] = i-100;
            }
        }
        return p;
    }
}
