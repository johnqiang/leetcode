public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length, min = n, left = 0, right = 0, sum = 0;
        if (nums.length == 0)
            return 0;
		while(right < n){
			while(right < n && sum < s){
				sum += nums[right++];
			}
			while(sum >= s){
				min = Math.min(min, right-left+1);
				sum -= nums[left++];
			}
		}
		return min-1;
    }
}