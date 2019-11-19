/*
 * @lc app=leetcode id=240 lang=java
 *
 * [240] Search a 2D Matrix II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1])
            return false;
        int x = matrix.length - 1, y = 0;
        while (true) {
            if (matrix[x][y] > target)
                x--;
            else if (matrix[x][y] < target)
                y++;
            else
                return true;
            if (x < 0 || y >= matrix[0].length)
                break;
        }
        return false;
    }
}
// @lc code=end
