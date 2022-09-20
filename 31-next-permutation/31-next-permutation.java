class Solution {
    
    public void reverse(int[] nums,int i,int j)
    {
        int x=i, y=j-1;
        while(x<y)
        {
            swap(nums,x++,y--);
        }
    }
    
    public void swap(int[] nums,int x,int y)
    {
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
    }
    public void nextPermutation(int[] nums) {
        
        int ind = -1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
                ind = i;
        }
        int next_ind = ind;
        if(ind == -1)
            reverse(nums,0,nums.length);
        else
        {
            for(int i=ind+1;i<nums.length;i++)
            {
               if(nums[i]>nums[ind] && nums[i]==Math.min(nums[i],nums[ind+1])) 
               {
                  next_ind = i; 
               }
            }
            swap(nums,ind,next_ind);
            reverse(nums,ind+1,nums.length);
            
        }
        
    }
}