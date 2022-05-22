class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
     
        int sum =0,j=numbers.size()-1;
        vector<int> ans;
        for (int i =0; i< numbers.size();)
        {
           sum = numbers[i] + numbers[j] ;
            if(sum == target)
            {
                ans.push_back(i+1);
                ans.push_back(j+1);
                return ans;
            }
            if(sum > target)
            {
                j--;
            }
            else
                i++;
        }
        return ans;
        
    }
};