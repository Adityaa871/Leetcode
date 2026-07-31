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
    TreeNode f;
    TreeNode s;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        helper(root);
        int temp = f.val;
        f.val = s.val;
        s.val = temp;
    }
    void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);

        if(prev != null && prev.val > root.val){
            if(f == null){
                f = prev;
            }
            s = root;
        }

        prev = root;
        helper(root.right);
    }
}