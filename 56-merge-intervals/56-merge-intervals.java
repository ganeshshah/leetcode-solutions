class Solution {
    public int[][] merge(int[][] intervals) {
        
        Map<Integer,Integer> mI = new HashMap<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
     
        int left = intervals[0][0];
        int right = intervals[0][1];
        
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0] <= right)
                right = Math.max(intervals[i][1],right);
            else{
                mI.put(left,right);
                left = intervals[i][0];
                right = intervals[i][1];       
            }
        }
        mI.put(left,right);
        
        int[][] result = new int[mI.size()][2];
        
        int i =0;
        for (Map.Entry<Integer, Integer> entry : mI.entrySet()) {
        result[i][0] = entry.getKey();
        result[i][1]  = entry.getValue();
        i++;
        }
        return result;
        
    }
}