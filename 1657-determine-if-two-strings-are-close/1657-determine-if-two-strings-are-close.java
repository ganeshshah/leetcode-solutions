class Solution {
    public boolean closeStrings(String word1, String word2) {
        

        if(word1.length() != word2.length())
            return false;
        
        Map<Character,Integer> word1Map = new HashMap<>();
        Map<Character,Integer> word2Map = new HashMap<>();
        
        
        for(int i=0; i< word1.length();i++){
            word1Map.put(word1.charAt(i),word1Map.getOrDefault(word1.charAt(i),0)+1);
            word2Map.put(word2.charAt(i),word2Map.getOrDefault(word2.charAt(i),0)+1);
        }
        
        if(!word1Map.keySet().equals(word2Map.keySet()))
            return false;
        
        ArrayList<Integer> word1FrequencyList = new ArrayList<>(word1Map.values());
        ArrayList<Integer> word2FrequencyList = new ArrayList<>(word2Map.values());
        
        Collections.sort(word1FrequencyList);
        Collections.sort(word2FrequencyList);
        
        return word1FrequencyList.equals(word2FrequencyList);
    }
}