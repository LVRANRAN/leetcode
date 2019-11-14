/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 */
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 0) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                set.add(i);
            }
        }
        int sum = 0;
        for (int s : set) {
            sum += s;
        }
        return sum == num ? true : false;
    }
}
