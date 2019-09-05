/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int tempA = a.length() > i ? a.charAt(a.length() - i - 1) - '0' : 0; //-'0'是为了将char类型转换为int类型
            int tempB = b.length() > i ? b.charAt(b.length() - i - 1) - '0' : 0;
            sb.insert(0, (tempA + tempB + carry) % 2);
            carry = (tempA + tempB + carry > 1) ? 1 : 0;
        }
        if (carry == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
