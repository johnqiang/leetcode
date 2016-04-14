public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(nums[0], 1);
        for (int i = 1; i < nums.length; i++) {
            if (map.get(nums[i]) > nums.length / 2)
                return nums[i];
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]++));
            }else{
                map.put(nums[i], 1);
            }
        }
        return 0;
    }
}