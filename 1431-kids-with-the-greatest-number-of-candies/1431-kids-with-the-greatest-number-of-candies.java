class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxValue = Integer.MIN_VALUE;
        
        ArrayList<Boolean> result = new ArrayList<>();
        
        for(int i = candies.length-1 ; i>=0 ; i-- ){
           maxValue = Math.max(maxValue,candies[i]);
        }
        
        
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies  >= maxValue)
                result.add(true);
            else
                result.add(false);
        }
        
        return result;
    }
}