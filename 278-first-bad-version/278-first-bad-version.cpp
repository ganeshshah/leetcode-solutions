// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        
        long left = 1, right = n;
        long mid = left + (right - left)/2;
        long ans = 0;
        
        while ( left <= right )
        {
           if(isBadVersion(mid))
           {
               ans = mid;
               right = mid-1;
           }
            else
            {
                left = mid +1;
            }
            
            mid = left + (right - left)/2;
        }
        return ans;
    }
};