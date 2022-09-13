// 3 pointer approach from end
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        // 3 read pointer and 1 write pointer from end 
        int i = m-1;
        int j = n-1;
        
        for(int k = m+n-1; k>=0;k--)
        {
            if(i>=0 && j>=0)
                nums1[k] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
            else if(i>=0)
                nums1[k]=nums1[i--];
            else
                nums1[k]=nums2[j--];
        }
           
    }
}


class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        // 2 read pointer and 1 write pointer from front
        
       // 1. copy the given nums1 till m into nums1Copy
        //2. apply merge-sort logic using nums1Copy and nums2 and nums1 array as resultant array     
    }
}
