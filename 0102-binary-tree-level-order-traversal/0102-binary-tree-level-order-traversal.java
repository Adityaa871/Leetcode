/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, 0, res);
        return res;
    }
    public void helper(TreeNode root, int n, List<List<Integer>> res){
        if(root == null) return;

        if(n >= res.size()){
            res.add(new ArrayList<>());
        }

        res.get(n).add(root.val);

        helper(root.left , n+1, res);
        helper(root.right, n+1, res);
    }
}