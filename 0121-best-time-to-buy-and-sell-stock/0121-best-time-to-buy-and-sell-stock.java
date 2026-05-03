class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int n=prices.length;
        int profit = 0;
        for(int i=1;i<n;i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            int currProfit = prices[i]-buyPrice;
            profit = Math.max(currProfit, profit);
        }
        return profit;
    }
}