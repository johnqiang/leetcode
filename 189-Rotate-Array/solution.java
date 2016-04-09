public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length < 2)
            return;
        // int[] temp = Arrays.copyOf(nums, nums.length); // copy array cost O(n) extra space
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[(i+k)%nums.length]; // now extra space O(1)
            nums[(i+k)%nums.length] = nums[i];
            nums[i] = temp;
        }
    }
}