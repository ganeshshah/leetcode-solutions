class Solution {
    public boolean isSubsequence(String s, String t) {
        
        for(int i=0;i<s.length();i++){
            if(!t.contains(s.charAt(i)+"")){
                return false;
            }else{
                t = t.substring(t.indexOf(s.charAt(i))+1);
            }
        }
        return true;
    }
}