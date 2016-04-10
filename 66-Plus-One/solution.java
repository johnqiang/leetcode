public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        int sum = digits[i]+1;
        while(sum == 10) {
            digits[i] = 0;
            if(i == 0) {
                int[] temp = new int[digits.length+1];
                for(int j = 0; j < digits.length; j++) {
                    temp[j+1] = digits[j];
                }
                temp[0] = 1;
                return temp;
            }
            i--;
            sum = digits[i]+1;
        }
        digits[i]++;
        return digits;
    }
}