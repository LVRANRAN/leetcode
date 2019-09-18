import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]) == false) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], 1 + map.get(nums1[i]));
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j])) {
                if (map.get(nums2[j]) > 0) {
                    arr.add(nums2[j]);
                    map.put(nums2[j], map.get(nums2[j]) - 1);
                }
            }
        }
        int i = 0;
        int[] res = new int[arr.size()];
        for (int a : arr) {
            res[i++] = a;
        }
        return res;
    }
}
