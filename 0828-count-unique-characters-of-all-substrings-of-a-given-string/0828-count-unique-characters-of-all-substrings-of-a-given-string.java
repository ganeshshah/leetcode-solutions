class Solution {
   public static int uniqueLetterString(String s) {
        int n = s.length();
        int[] lastSeen = new int[256];
        int[] contribution = new int[256];
        Map<Integer, Integer> indexMap = new HashMap<>();

        int result = 0;
        int currentContribution = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int idx = c;

            if (indexMap.containsKey(idx)) {
                int previousIndex = indexMap.get(idx);
                currentContribution -= contribution[idx];
                contribution[idx] = i - previousIndex;
            } else {
                contribution[idx] = i + 1;
            }

            currentContribution += contribution[idx];
            indexMap.put(idx, i);

            result += currentContribution;
        }

        return result;
    }
}