import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=30 lang=java
 *
 * [30] Substring with Concatenation of All Words
 */

// @lc code=start
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int sLen = s.length();
        int wLen = words.length;
        if (s == null || wLen == 0 || words == null || sLen == 0 || s.equals("")) {
            return res;
        }
        int len = words[0].length();
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < len; i++) {
            int start = i, count = 0;
            HashMap<String, Integer> currFreq = new HashMap<>();
            for (int j = i; j <= sLen - len; j = j + len) {
                String sub = s.substring(j, j + len);
                if (freq.containsKey(sub)) {
                    currFreq.put(sub, currFreq.getOrDefault(sub, 0) + 1);
                    count++;
                    while (currFreq.get(sub) > freq.get(sub)) {
                        String leftMost = s.substring(start, start + len);
                        currFreq.put(leftMost, currFreq.get(leftMost) - 1);
                        start = start + len;
                        count--;
                    }
                    if (count == wLen) {
                        String leftMost = s.substring(start, start + len);
                        currFreq.put(leftMost, currFreq.get(leftMost) - 1);
                        res.add(start);
                        start = start + len;
                        count--;
                    }
                } else {
                    currFreq.clear();
                    start = j + len;
                    count = 0;
                }
            }
        }
        return res;
    }
}
// @lc code=end
