class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        for(int i=0;i<m && n>0 ;i++)
        {
           if(nums1[i]>nums2[0])
           {
               int temp = nums1[i];
               nums1[i] = nums2[0];
               nums2[0] = temp;
               
               int j=1;
               while(j<n && nums2[j]<nums2[j-1])
               {
               int temp2 = nums2[j];
               nums2[j] = nums2[j-1];
               nums2[j-1] = temp2;
                j++;
               }  
               //
           }     
        }
        
        for(int i=0;i<n;i++)
        {
            nums1[i+m]=nums2[i];
        }
        
    }
}