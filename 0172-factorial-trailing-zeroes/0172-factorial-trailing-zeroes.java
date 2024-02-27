class Solution {
    public int trailingZeroes(int n) {
     int res=0;
        int powerOf5=5;
        while(n>=powerOf5){
            res=res+(n/powerOf5);
            powerOf5=powerOf5*5;
        }
        return res;
    }
}