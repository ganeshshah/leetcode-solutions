class Solution {
public:
    void sortColors(vector<int>& nums) {
        
        int red = 0, white =0, blue =0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)
            {
              red++;  
            }
            else if(nums[i]==1)
            {
                white++;
            }
            else if(nums[i]==2)
            {
              blue++;  
            }
        }
        vector<int> v;
        vector<int> v1(red,0);
        v.insert(v.end(), v1.begin(), v1.end());
        vector<int> v2(white,1);
            v.insert(v.end(), v2.begin(), v2.end());
        vector<int> v3(blue,2);
            v.insert(v.end(), v3.begin(), v3.end());
        nums = v;
            
    }
};