class Solution {
    public int maxProfit(int[] prices) {
        int curr;
        int max=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            curr=prices[i]-min;
            max = Math.max(curr,max);
            min=Math.min(min,prices[i]);

        }
        return max;
    }
}