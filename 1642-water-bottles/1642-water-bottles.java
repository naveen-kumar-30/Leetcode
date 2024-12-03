class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res= ((numBottles-1)/(numExchange-1));
        return (numBottles+res);
    }
}