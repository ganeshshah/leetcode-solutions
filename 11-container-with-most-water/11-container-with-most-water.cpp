class Solution {
public:
    int maxArea(vector<int>& height) {
      
        int area = 0;
        int left = 0, right = height.size()-1;
        
        while(left<right)
        {
            int newarea = (right-left)* min(height[left],height[right]);
            if(newarea>area)
                area = newarea;
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return area;
    }
};