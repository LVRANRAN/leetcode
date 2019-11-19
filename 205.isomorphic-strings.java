import java.util.Hashtable;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Hashtable<Character, Character> s_t = new Hashtable<>();
        Hashtable<Character, Character> t_s = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            Character ss = s.charAt(i);
            Character tt = t.charAt(i);
            if (s_t.containsKey(ss) || t_s.containsKey(tt)) {
                if (s_t.get(ss) == tt && t_s.get(tt) == ss) {
                    continue;
                } else {
                    return false;
                }
            } else {
                s_t.put(ss, tt);
                t_s.put(tt, ss);
            }
        }
        return true;
    }
}
