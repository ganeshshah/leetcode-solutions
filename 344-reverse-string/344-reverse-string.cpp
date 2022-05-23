class Solution {
public:
    void reverseString(vector<char>& s) {
        
        int j = s.size()-1;
        for(int i=0;i<j;i++, j--)
        {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
};