public class Solution {
    public void moveZeroes(int[] nums) {
        for(int j = 0; j < nums.length-1; j++){
            for(int i = 0; i < nums.length-1-j; i++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
    }
}