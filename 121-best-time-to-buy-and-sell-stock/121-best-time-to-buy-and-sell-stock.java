class Solution {
    public int maxProfit(int[] prices) {
        
        
       int leftmin =  Integer.MAX_VALUE;
        int ans = 0;
       for(int i=0;i<prices.length;i++)
       {
           if(leftmin > prices[i])
               leftmin = prices[i];
           if(prices[i]-leftmin > ans)
               ans = prices[i]-leftmin;
           
       }
        return ans;
    }
}