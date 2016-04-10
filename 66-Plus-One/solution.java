public class Solution {
    public int[] plusOne(int[] digits) {
        // sample code from 'http://blog.csdn.net/linhuanmars/article/details/22365957'
        if (digits == null || digits.length == 0)
            return digits;
        int carry = 1;
        for (int i = digits.length-1; i >= 0; i--) {
            int digit = (digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            digits[i] = digit;
            if(carry == 0)
                return digits;
        }
        // improved
        int[] temp = new int[digits.length+1];
        temp[0] = 1;
        return temp;
    }
}