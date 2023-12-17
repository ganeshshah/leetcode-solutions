class Solution {
    public boolean isPalindrome(String s) {
        
        String refinedString = "";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if( Character.isLetterOrDigit(s.charAt(i)) ){
                refinedString += s.charAt(i);
            }
        }
        int i=0;
        int j= refinedString.length()-1;
        while(i<=j){
            if(refinedString.charAt(i) != refinedString.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}