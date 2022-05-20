class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int curr = 0;
        int maxi = INT_MIN;
        
        for(int num: nums) {
            
            curr = max(curr + num, num); 
            maxi = max(maxi, curr);
        }
    
        return maxi; 
    }
};