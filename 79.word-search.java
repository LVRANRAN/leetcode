/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) {
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        boolean exist = false;
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                exist = exist(board, visited, word, 0, i, j);
                if(exist) {
                    return true;
                }
            }
        }
        return exist;
    }
    
    private boolean exist(char[][] board, boolean[][] visited, String word, int cur, int i, int j) {
        if(cur == word.length()) {
            return true;
        }
        if(i<0||i>=board.length || j<0 || j >= board[0].length || visited[i][j]) {
            return false;
        }
        if(word.charAt(cur) != board[i][j]) {
            return false;
        }
        visited[i][j] = true;
        boolean b = exist(board, visited, word, cur+1, i+1, j) 
                || exist(board, visited, word, cur+1, i, j+1)
                || exist(board, visited, word, cur+1, i-1, j)
                || exist(board, visited, word, cur+1, i, j-1);
        visited[i][j] = false;
        return b;
    }
}
// @lc code=end
