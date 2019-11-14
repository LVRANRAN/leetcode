/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int res = 0;
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0' || visited[i][j] == true)
                    continue;
                helper(grid, visited, i, j);
                res++;
            }
        }
        return res;
    }

    public void helper(char[][] grid, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0' || visited[x][y])
            return;
        visited[x][y] = true;
        helper(grid, visited, x - 1, y);
        helper(grid, visited, x, y - 1);
        helper(grid, visited, x + 1, y);
        helper(grid, visited, x, y + 1);
    }
}
// @lc code=end
