/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ss : s.toCharArray()) {
            if (map.containsKey(ss) == false) {
                map.put(ss, 1);
            } else {
                map.put(ss, 1 + map.get(ss));
            }
        }
        for (char tt : t.toCharArray()) {
            if (map.containsKey(tt)) {
                if (map.get(tt) > 0) {
                    map.put(tt, map.get(tt) - 1);
                } else {
                    return tt;
                }
            } else {
                return tt;
            }
        }
        return 'a';
    }
}
