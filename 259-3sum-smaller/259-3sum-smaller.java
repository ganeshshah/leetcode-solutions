class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<3)
            return 0;
        
        int ans = 0;
        for(int i=0;i<n-2;i++)
        {
            // for(int j=i+1;j<n-1;j++)
            //     for(int k=j+1;k<n;k++)
            //     {
            //         if(nums[i]+nums[j]+nums[k] < target)
            //             ans++;
            //     }
            int newtarget = target - nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
               if(nums[j]+nums[k] < newtarget) 
               {
                   ans =ans +  k-j;
                   j++;
               }
                else
                    k--;
            
            }
            
        }
        
        return ans;
        
    }
}