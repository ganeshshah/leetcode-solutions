class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        
        set<int> parentSet;
        for(int i=0;i<nums.size();i++)
        {
            if(parentSet.find((nums[i]))!=parentSet.end())
                return true;
            parentSet.insert(nums[i]);
        }
        return false;
    }
};