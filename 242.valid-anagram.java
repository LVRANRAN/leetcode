import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (char S : s.toCharArray()) {
            if (map.containsKey(S)) {
                map.replace(S, map.get(S), map.get(S) + 1);
            } else {
                map.put(S, 1);
            }
        }
        for (char T : t.toCharArray()) {
            if (map.containsKey(T)&&map.get(T)!=0) {
                map.replace(T, map.get(T), map.get(T) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
