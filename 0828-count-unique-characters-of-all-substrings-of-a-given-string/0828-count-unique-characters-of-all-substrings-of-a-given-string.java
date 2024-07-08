class Solution {
   public static int uniqueLetterString(String s) {
        int n = s.length();
        int[] lastPos = new int[26];
        int[] contribution = new int[26];
        int totalUniqueCharsSum = 0;
        int currentUniqueCharsSum = 0;

        // Initialize the lastPos array with -1
        for (int i = 0; i < 26; i++) {
            lastPos[i] = -1;
        }

        // Traverse the string
        for (int i = 0; i < n; i++) {
            int charIndex = s.charAt(i) - 'A';

            // Calculate new contribution for current character
            currentUniqueCharsSum -= contribution[charIndex];
            contribution[charIndex] = i - lastPos[charIndex];
            currentUniqueCharsSum += contribution[charIndex];

            // Update the last seen position of the current character
            lastPos[charIndex] = i;

            // Add the current sum of unique characters to the total sum
            totalUniqueCharsSum += currentUniqueCharsSum;
        }

        return totalUniqueCharsSum;
    }
}