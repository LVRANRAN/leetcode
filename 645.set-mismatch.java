/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.add(num)) {
                set.add(num);
            } else {
                result[0] = num;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
