class Solution {
    public int longestConsecutive(int[] nums) {
        
       if(nums.length == 0)
           return 0;
        
        int count = 1;
        int ans = Integer.MIN_VALUE;
        Set<Integer> myset = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            myset.add(nums[i]);
        }
        
       TreeSet<Integer> treeSet = new TreeSet<Integer>(myset);
       if(myset.size() == 1)
            return 1;
        
        for(Integer i : treeSet)
        {
            if(myset.contains(i+1) )
            {
                count++;
                ans = Math.max(ans,count);
            }
            else
                count = 1;
            
        }
        return Math.max(count,ans);
    }
}