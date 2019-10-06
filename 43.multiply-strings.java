/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        int[] product = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int cur = product.length - 2 - i - j;
                product[cur] += a * b;
                product[cur + 1] += product[cur] / 10;
                product[cur] = product[cur] % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = product.length - 1; i > 0; i--) {
            if (sb.length() == 0 && product[i] == 0) {
                continue;
            }
            sb.append(product[i]);
        }
        sb.append(product[0]);
        return sb.toString();
    }
}
// @lc code=end
