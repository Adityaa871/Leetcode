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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int h = ht(root);
        for(int i = 0; i<h; i++){
            list.add(new ArrayList<>());
        }
        helper(root, 0, list, h);
        return list;
    }
    public void helper(TreeNode root, int n, List<List<Integer>> list, int h){
        if(root == null ) return;

        list.get(h - n-1).add(root.val);
       
        helper(root.left, n+1, list,h);
        helper(root.right, n+1, list,h);
    }

    public int ht(TreeNode root){
        if(root == null ) return 0;

        return 1 + Math.max(ht(root.left), ht(root.right));
    }
}