public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int[] profit = new int[prices.length];
        int minPrice = prices[0];
        profit[0] = 0;
        for(int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit[i] = Math.max(profit[i-1], prices[i]-minPrice);
        }
        return profit[prices.length-1];
    }
}