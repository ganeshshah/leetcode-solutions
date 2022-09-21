class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0 || s.length() == 1)
            return s.length();
        
      Map<Character,Integer> indmap = new HashMap<>();
        
        int l=0,ans=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if( !indmap.containsKey(s.charAt(i)) || ( indmap.containsKey(s.charAt(i)) && indmap.get(s.charAt(i)) < l) )
            {
                indmap.put(s.charAt(i),i);
                ans = Math.max(ans,(i-l+1));
            }
            else
            {
                l = indmap.get(s.charAt(i))+1 ;
                indmap.put(s.charAt(i),i);  
            }
        }
        return ans;
    }
}