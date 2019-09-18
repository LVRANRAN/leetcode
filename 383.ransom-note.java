import java.util.HashMap;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char m : magazine.toCharArray()) {
            if (map.containsKey(m) == false) {
                map.put(m, 1);
            } else {
                map.put(m, 1 + map.get(m));
            }
        }
        for (char r : ransomNote.toCharArray()) {
            if (map.containsKey(r)) {
                if (map.get(r) > 0) {
                    map.put(r, map.get(r) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
