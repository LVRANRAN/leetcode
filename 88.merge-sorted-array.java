/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int ia = m - 1;
        int ib = n - 1;
        while (ia >= 0 && ib >= 0) {
            if (nums1[ia] >= nums2[ib]) {
                nums1[index] = nums1[ia];
                index--;
                ia--;
            } else {
                nums1[index] = nums2[ib];
                index--;
                ib--;
            }
        }
        if (ia == -1) {
            while (ib >= 0) {
                nums1[index] = nums2[ib];
                index--;
                ib--;
            }
        }
    }
}
