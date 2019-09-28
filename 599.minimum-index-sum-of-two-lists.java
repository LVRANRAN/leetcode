/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> minRes = null;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int min = Integer.MAX_VALUE;
     
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
     
        for (int i = 0; i < list1.length; i++) {
            if (map2.containsKey(list1[i])) {
                int sum = map1.get(list1[i]) + map2.get(list1[i]);
                if (sum < min) {
                    min = sum;
                    minRes = new ArrayList<String>();
                    minRes.add(list1[i]);
                } else if (sum == min) {
                    minRes.add(list1[i]);
                }
            }
        }
     
        String[] strRes = new String[minRes.size()];
        for (int i = 0; i < minRes.size(); i++) {
            strRes[i] = minRes.get(i);
        }
     
        return strRes;
    }
}
