class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxcount = 0;
        int targetcheck = -1;
        for(int i=0;i<nums.length;i++)
        {
            map.merge(nums[i], 1, Integer::sum);
            int newmax = map.get(nums[i]) > maxcount ? map.get(nums[i]) : maxcount;
            if(newmax > maxcount)
            {
                targetcheck = nums[i];
                maxcount = newmax;
                
            }
        }
        
        if(targetcheck == target && maxcount > nums.length /  2)
            return true;
        return false;
        
    }
}