/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */
class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int c : candies) {
            if (set.add(c))
                set.add(c);
        }
        if (set.size() <= candies.length / 2) {
            return set.size();
        } else {
            return candies.length / 2;
        }
    }
}
