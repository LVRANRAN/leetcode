/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (flowerbed == null || flowerbed.length == 0)
            return false;
        if (flowerbed.length == 1 && flowerbed[0] == 0)
            return true;

        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0 || i == flowerbed.length - 1)
                    count++;
                count++;
            } else {
                n -= (count - 1) / 2;
                count = 0;
            }
        }

        n -= (count - 1) / 2;
        return n < 1;
    }
}
