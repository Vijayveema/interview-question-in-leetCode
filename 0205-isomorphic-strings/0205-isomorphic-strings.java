class Solution {
    public boolean isIsomorphic(String s, String t) {
   if (s.length() != t.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char m = s.charAt(i);
            char n = t.charAt(i);

            if (map1.containsKey(m)) {
                if (map1.get(m) != n) {
                    return false;
                }
            }

            if (map2.containsKey(n)) {
                if (map2.get(n) != m) {
                    return false;
                }
            }

            map1.put(m, n);
            map2.put(n, m);

        }

        return true;
    }
}