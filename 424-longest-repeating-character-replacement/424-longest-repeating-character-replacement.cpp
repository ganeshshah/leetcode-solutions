class Solution {
public:
    int characterReplacement(string s, int k) {
        
        unordered_map<char,int> charfreq;
        int j=0,maxi= INT_MIN,res = 0;
        for(int i=0;i<s.length();i++)
        {
            charfreq[s[i]]++;
             maxi = max (maxi, charfreq[s[i]]);
            while((i-j+1) - maxi > k)
            {
                charfreq[s[j]]--;
                j++;
            }
            res = max(res, i-j+1);
        }
        return res;
    }
};