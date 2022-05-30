class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int ans = -1;
        unordered_map<int,int>freqmap;
        for(int i=0;i<nums.size();i++)
        {
            freqmap[nums[i]]++;
            if(freqmap[nums[i]]==2)
                return nums[i];
        }
        return ans;
    }
};