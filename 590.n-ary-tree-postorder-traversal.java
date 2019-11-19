/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
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
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        posthel(root, res);
        return res;
    }

    public void posthel(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        List<Node> list = root.children;
        for (Node child : list) {
            posthel(child, res);
        }
        res.add(root.val);
    }
}
