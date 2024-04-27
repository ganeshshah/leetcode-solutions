class Solution {
    public String removeStars(String s) {
        
        Stack<Character> result = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='*'){
                if(!result.isEmpty()){
                    result.pop();
                }
            }else{
                    result.push(c);
                }
        }
        
       // Convert stack to string
        StringBuilder sb = new StringBuilder();
        for (Character element : result) {
            sb.insert(0, element); // Insert at the beginning to reverse the order
        }
        return sb.reverse().toString();
    }
}