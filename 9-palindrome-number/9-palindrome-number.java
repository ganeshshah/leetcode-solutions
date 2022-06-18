class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String s1 = new StringBuilder(s).reverse().toString();
        if(s.equals(s1))
            return true;
        return false;
    }
}