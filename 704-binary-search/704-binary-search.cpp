class Solution {
    
    
public:
    int search(vector<int>& nums, int target) {
        
       int left = 0, right = nums.size()-1;
        int mid = left + (right - left / 2);
        while ( left <= right ){
            if(nums[mid]==target)
                return mid;
            if(target>nums[left])
                left = left + 1;
            if(target<nums[right])
                right = right -1;
            mid = left + ( right - left) / 2;
        }
        return -1;
    }
};