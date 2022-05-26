class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        
        if((r * c) != (mat.size() * mat[0].size()))
            return mat;
        
        int ind = 0;
        int m = size(mat), n = size(mat[0]);
        vector<int> arr;
        vector<vector<int>> res(r, vector<int>(c));
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr.push_back(mat[i][j]);
            }
        }
        
         for(int i =0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[i][j]=arr[ind++];
            }
        }
        return res;
    }
};