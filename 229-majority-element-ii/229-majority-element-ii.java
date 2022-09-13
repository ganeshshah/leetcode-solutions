class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer,Integer> counts = new HashMap<Integer,Integer>();
        
       for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : counts.entrySet())
        {
            if(entry.getValue() > nums.length/3)
                result.add(entry.getKey());
        }
        
        return result;
        
    }
}