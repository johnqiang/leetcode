public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int minLength = nums.length;
        for(int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j];
                if(sum >= s && (j-i+1) < minLength){
                    minLength = j-i+1; 
                    break;
                }
            }
        }
        return minLength;
    }
}