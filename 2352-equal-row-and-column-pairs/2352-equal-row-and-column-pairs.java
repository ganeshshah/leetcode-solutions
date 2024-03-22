class Solution {
    public int equalPairs(int[][] grid) {
        
        int n = grid.length;
        int count = 0;
        
        HashMap<String,Integer> counterMap = new HashMap<>();

        for (int[] row : grid) {
            String rowString = Arrays.toString(row);
            counterMap.put(rowString, 1 + counterMap.getOrDefault(rowString, 0));
        }
        
        for(int column = 0; column<n; column++){
            int[] columnArray = new int[n];
            
            for(int row = 0; row < n; row++){
                columnArray[row] = grid[row][column];
            }
            
            count += counterMap.getOrDefault(Arrays.toString(columnArray),0);
        }
        
        return count;
    }
}