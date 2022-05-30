class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        
        int n = nums.size();
        sort(nums.begin(),nums.end());
        int mindiff = INT_MAX;
        int ans = 0;
        for(int i=0;i<n-1;i++)
        {
            int j=i+1;
            int k=n-1;
            
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                int diff = target - sum;
                if(diff<0)
                    diff = -1 * diff;
                if(diff<mindiff)
                {
                    mindiff = diff;
                    ans = sum;
                
                }
                if(sum > target)
                    k--;
                else 
                    j++;
            }
        }
        return ans;
    }
};