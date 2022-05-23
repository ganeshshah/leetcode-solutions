class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
       int leftmin =  INT_MAX;
        int ans = 0;
       for(int i=0;i<prices.size();i++)
       {
           if(leftmin > prices[i])
               leftmin = prices[i];
           if(prices[i]-leftmin > ans)
               ans = prices[i]-leftmin;
           
       }
        return ans;
    }
};