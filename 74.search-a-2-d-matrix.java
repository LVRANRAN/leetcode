/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0)
            return false;
        int n = matrix[0].length;
        int min = 0, max = m * n - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int row = mid / n; //Attention!
            int col = mid % n;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return false;
    }
}
// @lc code=end
