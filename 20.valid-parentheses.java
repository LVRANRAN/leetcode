import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                res.push(ch);
            } else {
                if (res.isEmpty()) {
                    return false;
                }
                if (ch == ')' && res.peek() != '(') {
                    return false;
                }
                if (ch == ']' && res.peek() != '[') {
                    return false;
                }
                if (ch == '}' && res.peek() != '{') {
                    return false;
                }
                res.pop();
            }
        }
        return res.isEmpty();
    }
}
