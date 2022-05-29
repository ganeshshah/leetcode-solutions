
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
       
       
        int n = nums.size();
        sort(nums.begin(),nums.end());
        set<vector<int>> myset;
        
        for(int i=0;i<n-1;i++)
        {
            
            int j = i+1;
            int k = n-1;
            while(j<k)
            {
            int sum = nums[i]+nums[j]+nums[k];
               
            if(sum == 0)
            {
              myset.insert({nums[i],nums[j],nums[k]});
                j++;
            }
            if(sum > 0 )
            {
               k--; 
            }
            if(sum < 0)
            {
                j++;
            }
            }
        }
        
         vector<vector<int>> vv(myset.begin(),myset.end());
        
        return vv;
    }
};