class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        
       HashMap<String,ArrayList<String>> mymap = new HashMap<>();
        
        for(String s : strings)
        {
            String st = "";
            char[] arr = s.toCharArray();
            for(int i=1;i<arr.length;i++)
            {
                st+=((arr[i] - arr[i - 1] + 26) % 26 + 'a');
            }
            ArrayList<String> li = mymap.getOrDefault(st,new ArrayList<String>());
            li.add(s);
            mymap.put(st,li);
            
        }
        
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,ArrayList<String>> entry : mymap.entrySet())
        {
            result.add(entry.getValue());
        }
        return result;
    }
}
    