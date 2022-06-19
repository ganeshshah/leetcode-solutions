class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String st) {
        int dict[] = new int[256];
        char s[] = st.toCharArray();
        
        HashSet<Character> myset= new HashSet<>();
        int ans = -1;
        int count = 1;
        
        myset.add(s[0]);
        dict[s[0]]=0;
        for(int i=1;i<s.length;i++)
        {
            

           myset.add(s[i]);
           
           if(s[i]!=s[i-1])
                dict[s[i]]=i;
            
            if(myset.size()>2)
            {
              
              if(count > ans) 
                  ans = count;
                count = i - dict[s[i-1]]+1;
              
                for(char c : myset)
                {
                    if(c != s[i-1] && c!=s[i])
                    {
                        myset.remove(c);
                        break;
                    }
                }
            }
            else
            {
                 count++;
            }
        }
        
        if(count > ans) 
                  ans = count;
        return ans;
    }
}