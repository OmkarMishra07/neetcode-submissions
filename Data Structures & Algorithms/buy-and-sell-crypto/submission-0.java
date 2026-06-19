class Solution {
    public int maxProfit(int[] prices) {
         int max = Integer.MIN_VALUE;
         int n = prices.length;
         int i = 0;
        int j = 1;
        while(j<n){
            if(prices[i] < prices[j]) {
                max =  Math.max(max , prices[j] - prices[i]);
                j++;
            }
            else{
            i=j;
            j++; }
        }
        return (max < 0) ? 0 : max;
    }
}
