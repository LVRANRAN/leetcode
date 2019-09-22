/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */
class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        res[1] = (int) Math.sqrt(area);
        while (area % res[1] != 0) {
            res[1]--;
        }
        res[0] = area / res[1];
        return res;
    }
}
