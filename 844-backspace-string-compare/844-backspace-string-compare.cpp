class Solution {
public:
    bool backspaceCompare(string s, string t) {
        
        vector<char> v;
         vector<char> v1;
        for(int i=0;i<s.length();i++)
        {
            if(s[i]=='#' && v.size()>0)
                v.pop_back();
            if(s[i]!='#')
            {
                v.push_back(s[i]);
            }     
        }
        for(int i=0;i<t.length();i++)
        {
            if(t[i]=='#' && v1.size()>0)
                v1.pop_back();
            if(t[i]!='#')
            {
                v1.push_back(t[i]);
            }     
        }
        if(v == v1)
            return true;
        return false;
    }
};