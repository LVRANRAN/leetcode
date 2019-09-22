/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                int j = map.get(nums1[i]) + 1;
                while (j < nums2.length) {
                    if (nums2[j] > nums1[i]) {
                        res[i] = nums2[j];
                        break;
                    } else {
                        j++;
                    }
                    res[i] = -1;
                }
                if (j >= nums2.length) {
                    res[i] = -1;
                }
            }
        }
        return res;
    }
}
