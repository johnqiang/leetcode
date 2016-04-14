public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length, min = n, left = 0, right = 0;
		while(left < n-1){
			int sum = 0, len = 0;
			while(sum < s){
				sum += nums[left++];
				len++;
			}
			if(len < min)
				min = len;
		}
		return min;
    }
}