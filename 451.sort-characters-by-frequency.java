import java.util.*;
/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

// @lc code=start
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (e1, e2) -> e2.getValue() - e1.getValue());
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            pq.add(m);
        }
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> cur = pq.poll();
            char ch = cur.getKey();
            int cnt = cur.getValue();
            while (cnt > 0) {
                sb.append(ch);
                cnt--;
            }
        }
        return sb.toString();
    }
}
// @lc code=end
