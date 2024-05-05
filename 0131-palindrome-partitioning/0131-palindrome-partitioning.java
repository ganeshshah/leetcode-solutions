import java.util.ArrayList;
import java.util.List;

class Solution {

    List<List<String>> result;

    public List<List<String>> partition(String s) {

        result = new ArrayList<>();

        palindromePartition(s, 0, s.length(), new ArrayList<String>());

        return result;

    }

    void palindromePartition(String s, int start, int end, ArrayList<String> list) {

        if (start >= end) {
            result.add(new ArrayList<>(list)); // Add a copy of the current list to result
            return;
        }

        for (int i = start; i < end; i++) {
            if (isPalindrome(s, start, i + 1)) {
                list.add(s.substring(start, i + 1)); // Add current palindrome substring
                palindromePartition(s, i + 1, end, list); // Continue partitioning the rest of the string
                list.remove(list.size() - 1); // Backtrack by removing the last palindrome substring
            }
        }
    }

     boolean isPalindrome(String s, int i, int j){
        String subStr = s.substring(i,j);
        //System.out.println(subStr);
        StringBuilder sb = new StringBuilder(subStr);
        //System.out.println(sb.reverse().toString().equals(subStr));
        return sb.reverse().toString().equals(subStr);
    }

}
