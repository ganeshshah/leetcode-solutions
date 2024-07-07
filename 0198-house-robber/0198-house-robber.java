class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // Initialize the dp array with -1 to indicate that the subproblem has not been solved yet.
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helpRobber(0, n, nums, dp);
    }
    
    int helpRobber(int i, int n, int[] nums, int[] dp) {
        if (i >= n) {
            return 0;
        }
        
        // Check if the result for this subproblem is already computed.
        if (dp[i] != -1) {
            return dp[i];
        }
        
        // Compute the result for this subproblem and store it in the dp array.
        dp[i] = Math.max(helpRobber(i + 1, n, nums, dp), nums[i] + helpRobber(i + 2, n, nums, dp));
        
        return dp[i];
    }
}
