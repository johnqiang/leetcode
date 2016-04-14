public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int minLength = nums.length;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum >= s){
                	if((j-i+1) < minLength)
                		minLength = j-i+1; 
                    break;
                }
            }
        }
        return minLength;
    }
}