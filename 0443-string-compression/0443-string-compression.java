class Solution {
    public int compress(char[] chars) {
        
        String s = "";
        
        int count = 1;
        char c = chars[0];
        
        for(int i=1;i<chars.length;i++){
           
            if(chars[i] == chars[i-1]){
                count++;
            }else{
                s += c;
                if(count > 1)
                    s += count;
                count = 1;
                c = chars[i];
            }
                        
        }
        
        s = s + c;
        if(count > 1)
            s += count;
        
        for(int i=0;i<s.length();i++){
                chars[i] = s.charAt(i);
        }
            
        return s.length();
        
    }
}