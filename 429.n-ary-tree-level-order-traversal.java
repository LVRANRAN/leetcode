/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> singleLevel = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node tmpNode;
        int s = queue.size();
        while (!queue.isEmpty()) {
            if (s == 0) {
                res.add(singleLevel);
                s = queue.size();
                singleLevel = new ArrayList<>();
            }
            tmpNode = queue.poll();
            s--;
            singleLevel.add(tmpNode.val);
            for (Node ch : tmpNode.children) {
                queue.add(ch);
            }
        }
        res.add(singleLevel);
        return res;
    }
}
