class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++)
            set1.add(nums1[i]);
        
         for(int i=0;i<nums2.length;i++)
            set2.add(nums2[i]);
        
        HashSet<Integer> temp = new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(temp);
        List<Integer> list1 = new ArrayList<>(set1);
        List<Integer> list2 = new ArrayList<>(set2);
        
         ArrayList<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
        
        
    }
}