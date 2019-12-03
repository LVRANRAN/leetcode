/*
 * @lc app=leetcode id=402 lang=java
 *
 * [402] Remove K Digits
 */

// @lc code=start
class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        StringBuilder sb = new StringBuilder();
        if (n == 0 || n == k) 
            return "0";
        sb.append(num.charAt(0));
        int i = 1;
        while (i < n && k > 0) {
            while (sb.length() != 0 && num.charAt(i) < sb.charAt(sb.length() - 1) && k > 0) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(num.charAt(i));
            i++;
        }
        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        for (int j = i; j < n; j++) {
            sb.append(num.charAt(j));
        }
        int a = 0;
        while (a < sb.length()&&sb.length()>1) {
            if (sb.charAt(a) == '0') {
                sb.deleteCharAt(a);
            } else {
                break;
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
// @lc code=end
