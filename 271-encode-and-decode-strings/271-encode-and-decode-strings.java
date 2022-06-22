public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        String s ="";
        for(String st : strs)
            s=s+st+"_#_123#";
        return s;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        
        List<String> res = new ArrayList<>();
        String[] st = s.split("_#_123#",-5);
        // String last = st[st.length-1];
        // String last1 = "";
        // for(int i=0;i<last.length()-1;i++)
        // {
        //     last1+=last.charAt(i);
        // }
        // st[st.length-1] = last1;    
        
        for(int i=0;i<st.length-1;i++)
        {
            res.add(st[i]);
        }
        
        return res;  
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));