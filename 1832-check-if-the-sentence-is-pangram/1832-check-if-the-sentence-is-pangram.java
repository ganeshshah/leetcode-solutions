class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<Character> myset = new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            myset.add(sentence.charAt(i));
        }
        if(myset.size()==26)
            return true;
        return false;
    }
}