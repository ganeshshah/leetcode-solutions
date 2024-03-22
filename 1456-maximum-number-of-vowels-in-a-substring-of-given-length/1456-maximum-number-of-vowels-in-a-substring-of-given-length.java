class Solution {
    public int maxVowels(String s, int k) {
        
        int maxVowelsCount = Integer.MIN_VALUE;
        int vowelCount = 0;
        
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i)))
                vowelCount++;
        }
        
        maxVowelsCount = Math.max(maxVowelsCount,vowelCount);
        
        for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i)))
                vowelCount++;
            if(vowels.contains(s.charAt(i-k)))
                vowelCount--;
            maxVowelsCount = Math.max(maxVowelsCount,vowelCount);
        }
        
        return maxVowelsCount;
    }
}