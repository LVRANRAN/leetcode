import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=1001 lang=java
 *
 * [1001] Grid Illumination
 */

// @lc code=start
class Solution {
    private Map<Integer, Set<String>> lamp_X;
    private Map<Integer, Set<String>> lamp_Y;
    private Map<Integer, Set<String>> lamp_P;
    private Map<Integer, Set<String>> lamp_R;

    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
        int[] res = new int[queries.length];
        initialization(lamps);

        for (int i = 0; i < queries.length; i++) {
            int X = queries[i][0];
            int Y = queries[i][1];
            int state = isLight(X, Y) ? 1 : 0;
            res[i] = state;
            if (state == 1) {
                turnOff(X, Y);
                turnOff(X - 1, Y);
                turnOff(X + 1, Y);
                turnOff(X, Y - 1);
                turnOff(X, Y + 1);
                turnOff(X - 1, Y - 1);
                turnOff(X - 1, Y + 1);
                turnOff(X + 1, Y - 1);
                turnOff(X + 1, Y + 1);
            }
        }
        return res;
    }

    public void turnOff(int X, int Y) {
        int P = X + Y;
        int R = X - Y;
        StringBuilder sb = new StringBuilder();
        sb.append(X).append(',').append(Y);

        if (lamp_X.containsKey(X))
            lamp_X.get(X).remove(sb.toString());
        if (lamp_Y.containsKey(Y))
            lamp_Y.get(Y).remove(sb.toString());
        if (lamp_P.containsKey(P))
            lamp_P.get(P).remove(sb.toString());
        if (lamp_R.containsKey(R))
            lamp_R.get(R).remove(sb.toString());
    }

    public boolean isLight(int X, int Y) {
        int P = X + Y;
        int R = X - Y;

        if (lamp_X.containsKey(X) && !lamp_X.get(X).isEmpty())
            return true;
        if (lamp_Y.containsKey(Y) && !lamp_Y.get(Y).isEmpty())
            return true;
        if (lamp_P.containsKey(P) && !lamp_P.get(P).isEmpty())
            return true;
        if (lamp_R.containsKey(R) && !lamp_R.get(R).isEmpty())
            return true;
        return false;
    }

    public void initialization(int[][] lamps) {
        lamp_X = new HashMap<>();
        lamp_Y = new HashMap<>();
        lamp_P = new HashMap<>();
        lamp_R = new HashMap<>();

        for (int[] i : lamps) {
            int X = i[0];
            int Y = i[1];
            int P = X + Y;
            int R = X - Y;
            StringBuilder sb = new StringBuilder();

            if (!lamp_X.containsKey(X)) {
                lamp_X.put(X, new HashSet<>());
            }
            if (!lamp_Y.containsKey(Y)) {
                lamp_Y.put(Y, new HashSet<>());
            }
            if (!lamp_P.containsKey(P)) {
                lamp_P.put(P, new HashSet<>());
            }
            if (!lamp_R.containsKey(R)) {
                lamp_R.put(R, new HashSet<>());
            }

            sb.setLength(0);
            sb.append(X).append(',').append(Y);
            lamp_X.get(X).add(sb.toString());
            lamp_Y.get(Y).add(sb.toString());
            lamp_P.get(P).add(sb.toString());
            lamp_R.get(R).add(sb.toString());
        }
    }
}
// @lc code=end
