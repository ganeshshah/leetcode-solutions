class Solution {
    public boolean areSentencesSimilar(String[] s1, String[] s2, List<List<String>> similarPairs) {
        
        if(s1.length != s2.length)
            return false;
        
        HashMap<String,Set<String>> map = new HashMap<>();
        
        for(var similarpair : similarPairs)
        {
            if(!map.containsKey(similarpair.get(0)))
                map.put(similarpair.get(0), new HashSet<>());
            map.get(similarpair.get(0)).add(similarpair.get(1));
        }
        
        
        for(int i=0;i<s1.length;i++)
        {
            String word1 = s1[i], word2 = s2[i];
            boolean flag = false;
            if(map.containsKey(word1) && map.get(word1).contains(word2))
                flag = true;
            else if(map.containsKey(word2) && map.get(word2).contains(word1))
                flag = true;
            else if(word1.equals(word2))
                flag = true;
            if(!flag)
                return false;
            
        }
        
        
        
        return true;
        
    }
}