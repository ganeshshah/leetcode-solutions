class Solution {
    
    private int[][] memo;
    
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        
        memo = new int[len1+1][len2+1];
        
        for(int[] arr : memo)
            Arrays.fill(arr,-1);
        
        return lcsHelper(text1,text2,len1,len2);
        
    }

    int lcsHelper(String word1, String word2, int len1, int len2){

        if(len1 == 0 || len2 == 0){
            return 0;
        }
        
        if(memo[len1][len2] != -1)
            return memo[len1][len2];

        if(word1.charAt(len1-1) == word2.charAt(len2-1)){
             return 1 + (memo[len1-1][len2-1] = lcsHelper(word1,word2,len1-1,len2-1));
        }else{
            memo[len1-1][len2] = lcsHelper(word1,word2,len1-1,len2);
            memo[len1][len2-1] = lcsHelper(word1,word2,len1,len2-1);
           return Math.max(memo[len1-1][len2],memo[len1][len2-1]);
        }

    }
}