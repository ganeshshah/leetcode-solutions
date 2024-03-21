class Solution {
    public int maxOperations(int[] nums, int k) {
        
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int result = 0;
        
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum>k)
                j--;
            else if(sum<k)
                i++;
            else{
                i++;
                j--;
                result++;
            }
        }
        
        return result;
        
    }
}