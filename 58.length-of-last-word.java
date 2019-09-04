import java.util.Stack;

/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if (str.length==0) {
            return 0;
        }
        return str[str.length-1].length();
    }
}
