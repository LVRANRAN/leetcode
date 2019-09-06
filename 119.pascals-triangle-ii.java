import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> last = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            res = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                if (j==0||j==i) {
                    res.add(1);
                } else {
                    res.add(last.get(j-1)+last.get(j));
                }
            }
            last = res;
        }
        return res;
    }
}

