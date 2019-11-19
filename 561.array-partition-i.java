/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition I
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i = i + 2) {
            sum += list.get(i);
        }
        return sum;
    }
}
