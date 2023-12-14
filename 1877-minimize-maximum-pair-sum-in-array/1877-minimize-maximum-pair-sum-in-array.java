class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int i = 0;
        int j = nums.length-1;
        int maxima = Integer.MIN_VALUE;
        
        while(i < j){
            if(nums[i] + nums[j] > maxima){
                maxima = nums[i] + nums[j];
            }
            i++;
            j--;
        }
        return maxima;
    }
}