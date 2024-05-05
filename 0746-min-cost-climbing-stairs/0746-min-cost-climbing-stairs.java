class Solution {
    
    private int[] dp;
    
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length + 1];
        Arrays.fill(dp,-1);
        return minCost(cost.length,cost);
    }
    
    int  minCost(int i,int[] cost){
        
        if(i <= 1)
            return 0;
        
        if(dp[i] != -1)
            return dp[i];
        
        if(dp[i-1] == -1)
            dp[i-1] = cost[i-1] + minCost(i-1,cost);
        if(dp[i-2] == -1)
            dp[i-2] = cost[i-2] + minCost(i-2,cost);
    
        return dp[i] = Math.min(dp[i-1],dp[i-2]);
        
    }
}