class Solution {

    private int ways = 0;
    private static int[] memo;

    public int climbStairs(int n) {
        //ways = 0;  // Reset static variable
        memo = new int[n + 1];  // Initialize memoization array
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;  // Fill the memoization array with -1 to indicate uncomputed values
        }
        ways = climbHelper(0, n);
        return ways;
    }
    
    private int climbHelper(int i, int n) {
        if (i == n) {
            return 1;
        }
        
        if (i > n) {
            return 0;
        }

        if (memo[i] != -1) {
            return memo[i];
        }
        
        memo[i] = climbHelper(i + 1, n) + climbHelper(i + 2, n);
        return memo[i];
    }
}
