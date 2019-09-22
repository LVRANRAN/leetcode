/*
 * @lc app=leetcode id=475 lang=java
 *
 * [475] Heaters
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        if (houses == null|| heaters == null) {
            return 0;
        }
        int radius = Integer.MIN_VALUE;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i = 0, j = 0;
        while (i < houses.length) {
            while (j < heaters.length - 1 && Math.abs(heaters[j + 1] - houses[i]) <= Math.abs(heaters[j] - houses[i])) {
                j++;
            }
            radius = Math.max(radius, Math.abs(heaters[j] - houses[i]));
            i++;
        }
        return radius;
    }
}
