class Solution {
    public int longestMountain(int[] arr) {
        
        int n = arr.length;
        
        if( n < 3)
            return 0;
        
        
        int maxLength = 0;
        
        for( int i=1; i< n-1; ){
            
            if(arr[i] > arr[i-1]  && arr[i] > arr[i+1]){
                
                int left = i-1;
                int right = i +1;
                
                while(left > 0 && arr[left] > arr[left-1]){
                    left--;
                }
                
                 while(right < n-1 && arr[right] > arr[right+1]){
                    right++;
                }
                
                int resultantLength = right -left + 1;
                maxLength = Math.max(maxLength,resultantLength);
                
                i = right + 1;
            }else{
                i++;
            }
        }
        
        return maxLength;
        
    }
}