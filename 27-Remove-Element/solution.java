public class Solution {
    public int removeElement(int[] nums, int val) {
        int end = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (end != i && nums[end] == val) {
                    int temp = nums[end];
                    nums[end] = nums[i];
                    nums[i] = temp;
                }
                end++;
            }
        }
        return end;
    }
}