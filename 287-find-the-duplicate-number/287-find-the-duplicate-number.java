class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        int[] countArr = new int[n];
        int dup = 0;
        
        
        for(int i=0;i<n;i++)
        {
            if(countArr[nums[i]]<0)
            {
                 dup = nums[i];
                 break;
            }
            else
                countArr[nums[i]]--;
            
        }
        return dup;
    }
}