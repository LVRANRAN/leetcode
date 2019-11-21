import java.util.*;
/*
 * @lc app=leetcode id=1078 lang=java
 *
 * [1078] Occurrences After Bigram
 */

// @lc code=start
class Solution {
    public static String[] findOcurrences(String text, String first, String second) {
        List<String> res = new ArrayList<>();
        String[] split = text.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(first)) {
                if (i+1 < split.length && split[i+1].equals(second)) {
                    if(i + 2 < split.length) res.add(split[i+2]);
                }
            }
        }
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
        System.out.println(findOcurrences(text, first, second));
    }
}
// @lc code=end

