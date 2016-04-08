public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < map.size(); j++) {
                if (Math.abs(map.get(j) - nums[i]) <= t && Math.abs(i - j) <= k) {
                    return true;
                }
            }
            map.put(i, nums[i]);
        }
        return false;
    }
}