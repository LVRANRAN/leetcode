/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */
class Solution {
    public boolean isHappy(int n) {
        if (n==0) {
            return false;
        }
        if (n==1) {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            int tmp = 0;
            set.add(n);
            while (n != 0) {
                tmp += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = tmp;
        }
        return true;
    }
}
