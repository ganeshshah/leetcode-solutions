class Solution {
public:
    int twoSumLessThanK(vector<int>& nums, int k) {
        
        int max = -1;
        sort(nums.begin(),nums.end());
        int j= nums.size()-1;
        for(int i=0;i<j;)
        {
          if(nums[i]+nums[j] < k )
          {
              if(nums[i]+nums[j] > max)
               max = nums[i]+nums[j];
              
              i++;
          }
         else if(nums[i]+nums[j] >= k)
                j--;
            
            
        }
        
        return max;
    }
};