class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        int m = matrix.size();
        int n = matrix[0].size();
        int ansrow = -1;
        for(int i=0;i<m;i++)
        {
          ansrow = i;
          if(target<=matrix[i][n-1])
            break;
        }
        
        for(int i = 0; i<n;i++)
        {
            if(target == matrix[ansrow][i])
                return true;
        }
        
        return false;
    }
};