/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */
class Solution {
    public String reverseStr(String s, int k) {
        List<Character> list = new ArrayList<>();
        String res = "";
        char[] ch = s.toCharArray();
        int i = 0;
        while (i < ch.length) {
            if (i + k - 1 < ch.length) {
                for (int j = i; j < i + k; j++) {
                    list.add(ch[j]);
                }
                if ((i / k) % 2 == 0) {
                    Collections.reverse(list);
                }
                for (char l : list) {
                    res += String.valueOf(l);
                }
                list = new ArrayList<>();
                i += k;
            } else {
                for (int j = i; j < ch.length; j++) {
                    list.add(ch[j]);
                }
                if ((i / k) % 2 == 0) {
                    Collections.reverse(list);
                }
                for (char l : list) {
                    res += String.valueOf(l);
                }
                i += k;
            }
        }
        return res;
    }
}
