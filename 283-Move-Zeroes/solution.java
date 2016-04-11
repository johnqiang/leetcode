public class Solution {
    public void moveZeroes(int[] nums) {
        // for(int j = 0; j < nums.length-1; j++){ // stupid way !
        //     for(int i = 0; i < nums.length-1-j; i++) {
        //         if (nums[i] == 0) {
        //             int temp = nums[i];
        //             nums[i] = nums[i+1];
        //             nums[i+1] = temp;
        //         }
        //     }
        // }
        // clever way !
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) 
                nums[count++] = nums[i];
        }
        while(count < nums.length)
            nums[count++] = 0;
    }
}