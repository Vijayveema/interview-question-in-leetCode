class Solution {
    public boolean isSubsequence(String s, String t) {
     int m = s.length(), n = t.length();
        int i = 0, j = 0;
        for (; i < m && j < n; ++j) {
            char ch1=s.charAt(i);
            char ch2=t.charAt(j);
            if (ch1 == ch2) {
                ++i;
            }
        }
        return i == m;
    }
}