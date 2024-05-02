class Solution {
    int resultArray[] = new int[38];
    
    
    public int tribonacci(int n) {
        
        Arrays.fill(resultArray, -1);
        return helper(n);
    }
    
    int helper(int n){
        
         if(n == 0){
            resultArray[n] = 1;
            return 0;
        }
            
        
        if(n==1 || n==2 ){
            resultArray[n] = 1;
            return 1;
        }
        
        if(resultArray[n] != -1)
            return resultArray[n];
        
       return resultArray[n] = helper(n-1) + helper(n-2) + helper(n-3);
        
    }
}