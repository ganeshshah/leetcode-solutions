class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> myset = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            
            int j = i+1;
            int k = nums.length - 1;
            
            while(j<k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    myset.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                }
                else if(sum<0)
                    j++;
                else
                    k--;
                    
            }
            
        }
        
        
        list.addAll(myset);
        return list;
        
    }
}