import java.util.ArrayList;

/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */
class Solution {
    public int thirdMax(int[] nums) {
        int one, two, three, count = 0;
        one = two = three = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == one && count >= 1 || nums[i] == two && count >= 2 || nums[i] == three && count >= 3) {
                continue;
            } else if (nums[i] > one) {
                three = two;
                two = one;
                one = nums[i];
                count++;
            } else if (nums[i] > two) {
                three = two;
                two = nums[i];
                count++;
            } else if (nums[i] >= three) {
                three = nums[i];
                count++;
            }
        }
        if (count >= 3) {
            return three;
        } else {
            return one;
        }
    }
}
