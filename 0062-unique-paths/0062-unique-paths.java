class Solution {
    
    int[][] dp;
    
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return totalUniquePaths(0,0,m,n);
        
    }
    
    int totalUniquePaths(int i, int j, int m, int n){
        
        if(i == m-1 && j== n-1)
            return 1;
        
        if(i > m-1 || j > n-1)
            return 0;
        
        if(dp[i][j] != -1)
            return dp[i][j];
        
        return dp[i][j] = (totalUniquePaths(i+1,j,m,n) + totalUniquePaths(i,j+1,m,n)) ;
        
    }
}