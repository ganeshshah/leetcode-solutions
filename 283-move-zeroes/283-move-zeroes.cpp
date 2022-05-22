class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int x =nums.size();
        int index = 0;
        for(int i=0;i<x;i++)
        {
            if(nums[index]== 0  )
            {
                nums.erase(nums.begin() + index );
                nums.push_back(0);    
            }
            else
            {
                index++;
            }
            
        }
    }
};