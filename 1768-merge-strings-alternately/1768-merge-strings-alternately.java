class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int w1_length = word1.length();
        int w2_length = word2.length();
        int i,j=0;
        String s = "";
        
        for(i=0;i<w1_length;i++){
           
            if(i<w2_length){
                 s = s + word1.charAt(i) + word2.charAt(j++);
              
            }else
                break;
        }
        
        if(w1_length > w2_length)
            s +=word1.substring(i);
        
         if(w1_length < w2_length)
            s +=word2.substring(j);
        
        return s;
         
    }
}