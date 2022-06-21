class Solution {
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        
        HashMap<String,ArrayList<Integer>> mymap = new HashMap<>();
        int dist = Integer.MAX_VALUE;
        
        for(int i=0;i<wordsDict.length;i++)
        {
            ArrayList<Integer> arr = mymap.getOrDefault(wordsDict[i],new ArrayList<Integer>());
            arr.add(i);
            mymap.put(wordsDict[i],arr);
        }
        
         ArrayList<Integer> l1 = mymap.get(word1);
         ArrayList<Integer> l2 = mymap.get(word2);
        
        if(!word1.equals(word2))
        {
            int i=0,j=0;
            while(i<l1.size() && j<l2.size())
            {
                dist = Math.min(dist, Math.abs(l1.get(i)-l2.get(j)));
                if(l1.get(i)<l2.get(j))
                    i++;
                else
                    j++;
            }
            
        }
        else
        {
            ArrayList<Integer> sameli = mymap.get(word1);
            Collections.sort(sameli);
            for(int i=1;i<sameli.size();i++)
            {
                dist = Math.min(dist, Math.abs(sameli.get(i)-sameli.get(i-1)));
            }
            
        }
        
        return dist;
        
        
    }
}