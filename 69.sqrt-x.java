/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */
class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int begin = 0, end = x, middle = 0;
        while (begin <= end) {
            middle = begin + (end - begin) / 2;
            if (middle == x / middle) {
                return middle;
            } else if (middle < x / middle) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return end;
    }
}
