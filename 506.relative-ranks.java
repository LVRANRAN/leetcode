/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] dummy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dummy[i] = nums[i];
        }
        Arrays.sort(dummy);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < dummy.length; i++) {
            map.put(dummy[i], i);
        }
        List<String> res = new ArrayList<>();
        for (int num : nums) {
            if (map.get(num) == nums.length-1) {
                res.add("Gold Medal");
            } else if (map.get(num) == nums.length-2) {
                res.add("Silver Medal");
            } else if (map.get(num) == nums.length-3) {
                res.add("Bronze Medal");
            } else {
                res.add((nums.length- map.get(num)) + "");
            }
        }
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
