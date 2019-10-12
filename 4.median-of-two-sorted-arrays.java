/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N = nums1.length + nums2.length;
        if (N % 2 == 1) {
            return findKth(nums1, 0, nums2, 0, N / 2 + 1);
        } else {
            return (findKth(nums1, 0, nums2, 0, N / 2 + 1) + findKth(nums1, 0, nums2, 0, N / 2)) / 2.0;
        }
    }

    public int findKth(int[] a, int alo, int[] b, int blo, int k) {
        if (alo >= a.length) {
            return b[blo + k - 1];
        }
        if (blo >= b.length) {
            return a[alo + k - 1];
        }
        if (k == 1) {
            return Math.min(a[alo], b[blo]);
        }
        int i = k / 2 - 1;
        int aMid = Integer.MAX_VALUE;
        int bMid = Integer.MAX_VALUE;
        if (alo + i < a.length) {
            aMid = a[alo + i];
        }
        if (blo + i < b.length) {
            bMid = b[blo + i];
        }
        if (aMid < bMid) {
            return findKth(a, alo + i + 1, b, blo, k - i - 1);
        } else {
            return findKth(a, alo, b, blo + i + 1, k - i - 1);
        }
    }
}
// @lc code=end
