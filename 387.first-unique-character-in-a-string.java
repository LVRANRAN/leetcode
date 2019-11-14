import java.util.HashMap;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ss : s.toCharArray()) {
            if (map.containsKey(ss) == false) {
                map.put(ss, 1);
            } else {
                map.put(ss, 1 + map.get(ss));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
