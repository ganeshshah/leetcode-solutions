class Solution {
    int merge(int[] nums,int si,int mid,int ei)
    {
        int[] arr = new int[ei-si+1];
        
        int i1 = si, i2=mid+1, ind = 0;
        int i11 = i1, i22 = i2;
        int total = 0;
           
        for(int ii=si;ii<=mid;ii++)
        {
            while( i22<=ei && nums[ii] > 2L*nums[i22] )
            {
                i22+=1;
            }
            total += (i22-(mid+1));
        }
        
        while(i1 <= mid && i2 <= ei)
        {
            if(nums[i1] <= nums[i2])
                arr[ind++] = nums[i1++];
            else
                arr[ind++] = nums[i2++];      
        }
        
        while( i1 <= mid )
        {
           arr[ind++] = nums[i1++]; 
        }
        
        while( i2 <= ei )
        {
            arr[ind++] = nums[i2++];
        }
        
        for(int i=si;i<si+arr.length;i++)
            nums[i]=arr[i-si];
        
        return total;
    }
    
    int countrp(int[] nums,int si,int ei){
        
        if(si >= ei)
            return 0; 
        
        int mid = si + ( ei - si )/2;
        int rpcount = 0;
        rpcount += countrp(nums,si,mid);
        rpcount += countrp(nums,mid+1,ei);
        rpcount += merge(nums,si,mid,ei);
        return rpcount;
    }
    
    
    public int reversePairs(int[] nums) {
       
        
        int ans = countrp(nums,0,nums.length-1);
        return ans;
    }
}