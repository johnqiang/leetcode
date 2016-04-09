public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length < 2)
            return;
        int[] temp = nums;
        for(int i = 0; i < nums.length; i++) {
            nums[(i+k)%nums.length] = temp[i];
        }
    }
}