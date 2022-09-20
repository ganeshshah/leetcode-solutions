class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] == 0)
                {
                    int x=0,y=0;
                    while(x<m)
                    {
                        if(matrix[x][j]!=0)
                            matrix[x][j]=-123213;
                        x++;
        
                    }
                    while(y<n)
                    {
                        if( matrix[i][y]!=0)
                            matrix[i][y]=-123213; 
                        y++;
                    }
                }
            }
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] == -123213)
                    matrix[i][j]=0;
            }
        
        
    }
}