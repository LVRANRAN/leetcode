import java.util.HashMap;

/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */
class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ss : s.toCharArray()) {
            if (map.containsKey(ss) == false) {
                map.put(ss, 1);
            } else {
                map.put(ss, 1 + map.get(ss));
            }
        }
        Set<Character> set = map.keySet();
        for (char se : set) {
            if (map.get(se) > 1) {
                if (map.get(se) % 2 != 0) {
                    count++;
                }
                res += (map.get(se) / 2) * 2;
            } else {
                count++;
            }
        }
        if (count != 0) {
            res += 1;
        }
        return res;
    }
}
