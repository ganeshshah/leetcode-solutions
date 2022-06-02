class Solution {
public:
    bool isValid(string s) {
        
        stack<char> stk;
        
        for(int i=0;i<s.length();i++)
        {
            if(s[i]=='(' || s[i]=='[' || s[i]=='{' )
                stk.push(s[i]);
            else
            {
                if(stk.size() == 0)
                    return false;
                char br = stk.top();
                stk.pop();
                    if(!((s[i]==')' && br == '(') || (s[i]==']' && br == '[' )|| (s[i]=='}' && br == '{')))
                    {
                        return false;
                    }
                                               
            }
            
        }
        
        if(stk.size()==0)
             return true;
        
        return false;
    }
};