class Solution {
public:
    vector<int> twoSum(vector<int>& array, int targetSum) {
         for (int i = 0; i < array.size() - 1; i++)
    {
        int firstNum = array[i];
        for (int j = i + 1; j < array.size(); j++)
        {
            int secondNum = array[j];
            if (firstNum + secondNum == targetSum)
            {
                return vector<int>{i, j};
            }
        }
    }
    return {};
    }
};