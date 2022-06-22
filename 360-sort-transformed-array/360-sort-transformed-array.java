class Solution {
    
    int quad(int x,int a,int b,int c)
    {
        return a*x*x + b*x + c;
    }
    
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        
        int[] nums2 = Arrays.copyOf(nums,nums.length);
        for(int i=0;i<nums.length;i++)
        {
            nums2[i] = quad(nums[i],a,b,c);
        }
        Arrays.sort(nums2);
        return nums2;
        
    }
}