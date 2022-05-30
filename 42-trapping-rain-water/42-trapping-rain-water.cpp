class Solution {
public:
    int trap(vector<int>& height) {
        
        int left[height.size()],maxleft = INT_MIN;
        int right[height.size()], maxright = INT_MIN;
        int totalWater = 0;
        for(int i = 0; i<height.size();i++)
        {
            if(height[i]> maxleft)
                maxleft = height[i];
            
            left[i] = maxleft;    
        }
        for(int i =height.size()-1; i>=0;i--)
        {
            
            if(height[i]> maxright)
                maxright = height[i];
            
            right[i] = maxright;    
        }
        
        for(int i=0;i< height.size();i++)
        {
            totalWater += min(left[i],right[i]) - height[i];
        }
        return totalWater;
    }
};