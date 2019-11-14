/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length; ++j) {
                if (board[i][j] == '.')
                    continue;

                String rowkey = "row" + i + "-" + board[i][j];
                String colkey = "col" + j + "-" + board[i][j];
                int cubeindex = i / 3 * 3 + j / 3;
                String cubekey = "cube" + cubeindex + "-" + board[i][j];
                if (!set.add(rowkey) || !set.add(colkey) || !set.add(cubekey)) {
                    return false;
                }
            }
        }
        return true;
    }
}
