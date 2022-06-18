class Solution {
    public int missingNumber(int[] arr) {
        
        
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        
       return  (arr.length + 1)*(arr[0] + arr[arr.length-1]) / 2 - sum;
    }
}