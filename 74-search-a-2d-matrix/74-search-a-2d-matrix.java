class Solution {
    
    boolean binarySearch(int[] arr, int target)
    {
       
    
      int start = 0, end = arr.length-1;  
       while(start<=end)
       {
            int mid = start + (end - start)/2;
            if(arr[mid]==target)
                return true;
            if(arr[mid] < target)
                start = mid + 1;
            else 
                end = mid-1;
       }
        
        return false;
    
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        for(int i=0;i<matrix.length;i++)
        {
            if(binarySearch(matrix[i],target))
                return true;
        }
        
        return false;
    }
}