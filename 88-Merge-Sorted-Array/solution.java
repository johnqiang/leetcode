public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, index = m+n-1;
        while(index >= 0) { // code improvement
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j])){
                nums1[index--] = nums1[i--];
            }else {
                nums1[index--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}