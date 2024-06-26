class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        
       vector<int> result;
        unordered_map<int,int> freqMap;
        for(int i=0;i<nums1.size();i++)
        {
            freqMap[nums1[i]]++;
        }
        for(int i=0;i<nums2.size();i++)
        {
            if(freqMap[nums2[i]]>0)
            {
                result.push_back(nums2[i]);
                freqMap[nums2[i]]--;    
            }
        }
        return result;
    }
};