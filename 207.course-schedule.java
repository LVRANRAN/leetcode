import java.util.*;
/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph g = new Graph(numCourses);
        for (int i = 0; i < prerequisites.length; i++) {
            g.addEdge(prerequisites[i]);
        }
        List<List<Integer>> adjList = g.adjList;
        Map<Integer, Color> colors = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            colors.put(i, Color.WHITE);
        }
        for (int i = 0; i < numCourses; i++) {
            if (!colors.get(i).equals(Color.BLACK)) {
                if (dfs(adjList, colors, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> adjList, Map<Integer, Color> colors, int cur) {
        colors.put(cur, Color.GRAY);
        for (int item : adjList.get(cur)) {
            if (colors.get(item).equals(Color.WHITE)) {
                if(dfs(adjList, colors, item))
                    return true;
            } else if (colors.get(item) == Color.GRAY) {
                return true;
            }
        }
        colors.put(cur, Color.BLACK);
        return false;
    }

    static enum Color {
        WHITE, GRAY, BLACK;
    }

    static class Graph {
        List<List<Integer>> adjList;

        public Graph(int n) {
            adjList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        public void addEdge(int[] edge) {
            adjList.get(edge[0]).add(edge[1]);
        }
    }
}
// @lc code=end
