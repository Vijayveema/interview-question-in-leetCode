class Solution {
    public int hIndex(int[] citations) {
   int[] stats = new int[citations.length + 1];
        for (int i = 0; i < citations.length; i ++) {
            int n = citations[i];
            n = Math.min(n, citations.length);
            stats[n] ++;
        }
        int sum = 0;
        for (int i = stats.length - 1; i > 0; i --) {
            sum += stats[i];
            if (sum >= i) {
                return i;
            }
        }
        return 0;
    }
}