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
    int c = 0;
    public int countDominantNodes(TreeNode root) {
        helper(root);
        return c;
    }
    public int helper(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int left = helper(root.left);
        int right = helper(root.right);
 
        int max = Math.max(root.val, Math.max(left, right)); 
        if(root.val == max){
            c++;
        }
        return max;
    }
}