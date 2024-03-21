class Solution {
    public String reverseVowels(String str) {

        char[] s = str.toCharArray();
        int j = s.length - 1;
        int mid = s.length / 2;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i<j; i++) {

            char c = Character.toLowerCase(s[i]);
            if (vowels.contains(c)) {

                while (j >=i) {
                    char d = Character.toLowerCase(s[j]);
                    if (vowels.contains(d)) {
                        Character temp = s[j];
                        s[j--] = s[i];
                        s[i] = temp;
                        break;
                    }
                    j--;
                }
            }

        }
        return new String(s);
    }
}