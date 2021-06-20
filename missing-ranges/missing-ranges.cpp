class Solution {
public:
    string printFormat(int a, int b)
    {
        string s="";
        if(a==b)
            s+=to_string(a);
        if(a!=b)
            s+=to_string(a)+"->"+to_string(b);
        
        return s;
    }
    vector<string> findMissingRanges(vector<int>& nums, int lower, int upper) {
        
       vector<string> v;
        
        if(nums.size()==0)
        {
            v.push_back(printFormat(lower,upper));
        
            return v;
        }
        if(lower<nums[0])
        {
            v.push_back(printFormat(lower,nums[0]-1));
        }
        for(int i=0;i<nums.size()-1;i++)
        {
            int diff = nums[i+1]-nums[i];
            if(diff>=2)
                v.push_back(printFormat(nums[i]+1,nums[i+1]-1));
        }
        if(upper>nums[nums.size()-1])
        {
             v.push_back(printFormat(nums[nums.size()-1]+1,upper));
        }
        return v;
    }
};