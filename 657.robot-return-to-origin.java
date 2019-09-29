/*
 * @lc app=leetcode id=657 lang=java
 *
 * [657] Robot Return to Origin
 */
class Solution {
    public boolean judgeCircle(String moves) {
        char[] ch = moves.toCharArray();
        int vertical = 0;
        int horizon = 0;
        for (char c : ch) {
            if (c == 'U') {
                vertical++;
            }
            if (c == 'D') {
                vertical--;
            }
            if (c == 'L') {
                horizon--;
            }
            if (c == 'R') {
                horizon++;
            }
        }
        if (vertical == 0 && horizon == 0) {
            return true;
        }
        return false;
    }
}
