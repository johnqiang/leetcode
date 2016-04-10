public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        int sum = digits[i]+1;
        while(sum == 10) {
            digits[i] = 0;
            i--;
            sum = digits[i]+1;
        }
        digits[i]++;
        return digits;
    }
}