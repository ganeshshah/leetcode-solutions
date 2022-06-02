class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        
        unordered_map<char, int> s1;
        unordered_map<char, int> s2;
        
        
        if(ransomNote.length() > magazine.length())
            return false;
        
        for(int i =0; i<ransomNote.length();i++)
        {
            s1[ransomNote[i]]++;
        }
        for(int i =0; i<magazine.length();i++)
        {
            s2[magazine[i]]++;
        }
        
        for(int i =0; i<ransomNote.length();i++)
        {
            if(s1[ransomNote[i]]>s2[ransomNote[i]])
                return false;
        }
        return true;
    }
};