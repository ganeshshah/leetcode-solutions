class Solution {
public:
    int missingNumber(vector<int>& nums) {
        
        int sum = 0, n = nums.size();
        int totalSum = n * (n+1) / 2;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        return totalSum-sum;
    }
};