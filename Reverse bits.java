//https://leetcode.com/problems/reverse-bits/submissions/1425443330/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       // return Integer.reverse(n);
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1); 
            n >>= 1;
        }
        return result;
    }
}
