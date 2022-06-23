class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        int[] leftarr = new int[n];
        int[] rightarr = new int[n];
        int sumleft = 0;
        int sumright = 0;
        
        for(int i=0;i<n;i++)
        {
            sumleft+=nums[i];
            sumright+=nums[n-i-1];
            leftarr[i] = sumleft;
            rightarr[n-i-1] = sumright;
        }
        
        for(int i=0;i<n;i++)
        {
            if(leftarr[i]==rightarr[i])
                return i;
        }
        return -1;
        
    }
}