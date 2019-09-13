import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if (pattern.length() != s.length) {
            return false;
        }
        HashMap<Character, String> table = new HashMap<>();
        Set<String> unique = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (table.containsKey(pattern.charAt(i))) {
                if (!table.get(pattern.charAt(i)).equals(s[i])) {
                    return false;
                }
            } else {
                if (unique.contains(s[i]))
                    return false;
                table.put(pattern.charAt(i), s[i]);
                unique.add(s[i]);
            }
        }
        return true;
    }
}
