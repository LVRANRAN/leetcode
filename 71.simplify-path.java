/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        // special case
        if (path.length() == 0)
            return "";
        if (path.length() == 1)
            return "/";
        // general case
        Stack<String> stack = new Stack<>();
        String[] strings = path.split("/");
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            if (str.equals(".") || str.equals("")) {
                continue;
            } else if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        if (stack.isEmpty())
            return "/";
        String res = "";
        while (!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }
        return res;
    }
}
// @lc code=end
