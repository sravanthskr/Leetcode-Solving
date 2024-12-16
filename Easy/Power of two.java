https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        // Return true if n is greater than 0 and has only one bit set
        return n > 0 && (n & (n - 1)) == 0;
    }
}
