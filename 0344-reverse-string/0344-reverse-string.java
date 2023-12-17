class Solution {
    public void reverseString(char[] c) {
        
        int n = c.length;
        
        int i=0,j=n-1;
        
        while(i<j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        
    }
}