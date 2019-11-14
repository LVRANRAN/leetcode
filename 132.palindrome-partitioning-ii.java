/*
 * @lc app=leetcode id=132 lang=java
 *
 * [132] Palindrome Partitioning II
 */

// @lc code=start
class Solution {
    public int minCut(String s) {
        char str[] = s.toCharArray();
        //isPalindrome[i][j] is true means that s.sbustring(i,j) is palindrome
        boolean[][] isPalindrome = new boolean[s.length()][s.length()];
        //nums[i] means the min partition for s.substring(0,i)
        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                if (str[i]==str[j] && (j >= i -1 || isPalindrome[j+1][i-1])) {
                    isPalindrome[j][i] = true;
                    min = j == 0? 0 : Math.min(min, nums[j-1]+1);
                }
            }
            nums[i] = min;
        }
        return nums[s.length()-1];
    }
}
// @lc code=end

