class Solution {
    public String mergeAlternately(String word1, String word2) {
   int m = word1.length();
        int n = word2.length();
        // Create a StringBuilder to store the merged string
        StringBuilder ans = new StringBuilder();
        // minimum length
        int minLength = Math.min(m, n);

        for (int i = 0; i < minLength; ++i) {
            // append the charecterof word1 nad word2
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }

        // Append the remaining characters from the longer string
        for (int i = minLength; i < m; ++i) {
            ans.append(word1.charAt(i));
        }

        for (int i = minLength; i < n; ++i) {
            ans.append(word2.charAt(i));
        }
         // Convert the StringBuilder to a string and return it
        return ans.toString();
    }
};