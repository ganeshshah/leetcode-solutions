class Solution {
public:
    bool canPermutePalindrome(string s) {
     
        
        int c=0;
        sort(s.begin(),s.end());
        for(int i=0;i<s.length();)
        {
            if(s[i]!=s[i+1])
            {
                c++;
                i++;
            }
            else
                i=i+2;
        }
        if(c>1)
            return false;
        return true;
    }
};