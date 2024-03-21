class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int ans = 1;
        int[] answer = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            ans = ans * nums[i];
            answer[i] = ans;
        }
        
        int leftProduct = 1;
        
        for(int j=nums.length-1; j>0; j--){
            answer[j] = answer[j-1]*leftProduct;
            leftProduct = leftProduct * nums[j];
        }
        
        answer[0] = leftProduct;
        
        return answer;
    }
}