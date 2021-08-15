import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
         Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
         Set<Integer> s2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        
        
        s1.retainAll(s2);
        int a[] = new int[s1.size()];
        int i=0;
        for(Integer x : s1)
            a[i++]=x;
        return a;
        
        
        
    }
}