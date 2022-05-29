class Solution {
public:
    int totalFruit(vector<int>& fruits) {
     unordered_map<int,int>map;  
        int len = fruits.size();
        int j=0, count=0;
        for(int i=0;i<len; i++)
        {
            map[fruits[i]]++;
            
            while(map.size()>2)
            {
               map[fruits[j]]--;
                if(map[fruits[j]]==0)
                    map.erase(fruits[j]);
                j++;
            }
            count = max(count, (i-j +1));
        
        }
        return count;
        
    }
};