class Solution {
public:
    int countElements(vector<int>& arr) {
     
        int result = 0;
        int x_count=0;
        sort(arr.begin(),arr.end());
        for(int i=0;i<arr.size()-1;i++)
        {
           if(arr[i+1]-arr[i] == 1) 
           {
             result=result+x_count+1;
               x_count =0;
           }
           if(arr[i+1]==arr[i])
           {
               x_count++;
           }
            if(arr[i+1]-arr[i] >1)
            {
                x_count = 0;
            }
        }
        return result;
        
    }
};