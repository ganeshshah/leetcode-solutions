class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        
        max = Math.max(max,sum);
        
        for(int i=k; i<nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            max = Math.max(max,sum);
        }
        
        return max * (1.0) / k;
        
    }
}