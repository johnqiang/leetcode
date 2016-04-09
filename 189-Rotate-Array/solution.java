public class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = nums;
        for(int i = 0; i < k; i++) {
            nums[i] = temp[nums.length-k+i];
        }
        for(int j = k; j < nums.length; j++) {
            nums[j] = temp[j-k];
        }
    }
}