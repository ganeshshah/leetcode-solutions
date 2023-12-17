class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        
        int i=0, j=n-1;
        int area = 0;
        while(i<j){
            
            int maxArea = (j-i)  *  Math.min(height[i], height[j]);
            if(maxArea > area)
                area = maxArea;
            
            if(height[i]<height[j])
                i++;
            else
                j--;
             
        }
        
        return area;
    }
}