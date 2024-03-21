class Solution {
    public String reverseWords(String s) {
        
        
    String[] listOfWords = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();
        
    for(int i = listOfWords.length-1; i>=0 ; i--){
        String st = listOfWords[i].trim();
        sb.append(st + " ");
    }
        
    return sb.toString().trim();
        
    }
}