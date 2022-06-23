class Solution {
    public boolean rotateString(String s, String goal) {
        
        for(int i=0;i<s.length()-1;i++)
        {
         String st = s.substring(i+1,s.length()) + s.substring(0,i+1) ;  
            if(st.equals(goal))
                return true;
        }
        return false;
    }
}