/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();//Attention
        Arrays.sort(strs);
        for (int i = 0; i < strs.length; i++) {
            char[] cs = strs[i].toCharArray();
            Arrays.sort(cs);
            String dummy = String.valueOf(cs);
            if (!map.containsKey(dummy)) {
                map.put(dummy,new ArrayList<>());
            }
            map.get(dummy).add(strs[i]); //Attention
        }
        return new ArrayList<>(map.values()); //Attention
    }
}
// @lc code=end
