import java.util.ArrayList;
import java.util.HashSet;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                intersect.add(nums2[j]);
            }
        }
        int[] res = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            res[i++] = num;
        }
        return res;
    }
}
