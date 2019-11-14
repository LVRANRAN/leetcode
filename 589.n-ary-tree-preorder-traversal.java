/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        prehel(root, res);
        return res;
    }

    public void prehel(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        List<Node> list = root.children;
        res.add(root.val);
        for (Node child : list) {
            prehel(child, res);
        }
    }
}
