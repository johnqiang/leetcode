public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length < 2)
            return;
        // int[] temp = Arrays.copyOf(nums, nums.length); // copy array cost O(n) extra space
        int index = 0;
        int temp0 = nums[0];
        int temp1 = nums[0];
        for(int i = 0; i < nums.length; i++) {
            temp0 = temp1;
            temp1 = nums[(index+k)%nums.length]; // now extra space O(1)
            nums[(index+k)%nums.length] = temp0;
            index = (index+k)%nums.length;
        }
    }
}