class Solution {
    public boolean isPowerOfTwo(int n) {
        //using loop 0(logn) T.C ...
        if (n <= 0) return false;
        while (n%2 == 0) n/=2;
        return n == 1;
    }
}
