/*
 * @lc app=leetcode id=1108 lang=java
 *
 * [1108] Defanging an IP Address
 */

// @lc code=start
class Solution {
    public static String defangIPaddr(String address) {
        String[] ch = address.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (i == 3)
                sb.append(ch[i]);
            else
                sb.append(ch[i]).append("[.]");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "1.1.1.1";
        System.out.println(defangIPaddr(a));
    }
}
// @lc code=end
