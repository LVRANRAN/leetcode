/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */
class Solution {
    public String reverseWords(String s) {
        String[] sp = s.split(" ");
        String res = "";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < sp.length; i++) {
            char[] cur = sp[i].toCharArray();
            for (char c : cur) {
                list.add(c);
            }
            Collections.reverse(list);
            for (char l : list) {
                res += l;
            }
            if (i != sp.length - 1) {
                res += " ";
            }
            list = new ArrayList<>();
        }
        return res;
    }
}
