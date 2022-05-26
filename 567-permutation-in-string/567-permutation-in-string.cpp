class Solution {
public:
    bool checkInclusion(string s1, string s2) {
      
        int len = s1.length();
        vector<int> v1(26), v2(26);
        if(len > s2.length())
            return false;
        for(int i=0;i<len;i++)
        {
            v1[s1[i]-'a']++;
            v2[s2[i]-'a']++;
        }
        if(v1==v2)
            return true;
        for(int i = len;i<s2.length();i++)
        {
            v2[s2[i - len ] - 'a']--;  
            v2[s2[i]-'a']++; 
            if(v1==v2)
                return true;      
        }
   
        return false;
    }
    
//     vector<int> map_s1(26), map_s2(26);
// 		for(char& i1 : s1) 
// 			map_s1[i1 - 'a']++;
// 		for(int i = 0; i < s2.size(); i++) {
// 			map_s2[s2[i] - 'a']++;
// 			if(i >= s1.size() - 1) {
// 				if(map_s2 == map_s1)  // Time: O(26)
// 					return true;
// 				map_s2[s2[i - s1.size() + 1] - 'a']--;
// 			}
// 		}
// 		return false;
        
       
};