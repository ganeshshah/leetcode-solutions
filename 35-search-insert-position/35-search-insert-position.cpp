class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        
        int left = 0, right = nums.size() - 1;
        int mid = left + ( right - left ) / 2;
        
        while (left <= right)
        {
            if(nums[mid]== target)
                return mid;
            if(target > nums[left])
            {
                left = left + 1;
            }
            if(target < nums[right])
            {
                right--;
            }
            mid = left + ( right - left ) / 2;
        }
        
        return left;
    }
};