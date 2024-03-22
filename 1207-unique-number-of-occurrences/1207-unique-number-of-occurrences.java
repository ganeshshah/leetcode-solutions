class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
      
        HashMap<Integer,Integer>  map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            int previousValue = map.get(arr[i]) == null ?  0 : map.get(arr[i]);
            map.put(arr[i], previousValue+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            set.add(entry.getValue());
        }
        
        
        if(set.size() == map.size())
            return true;
        
        return false;
        
    }
}