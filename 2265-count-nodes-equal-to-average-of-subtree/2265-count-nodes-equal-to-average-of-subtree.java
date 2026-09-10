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
    public int averageOfSubtree(TreeNode root) {
        int c = 0;
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res);

        for(List<Integer> curr: res){
            if(helper(curr) == true) c++;
        }
        return c;
    }
    public boolean helper(List<Integer> res){
        int sum = 0;
        for(int x : res){
            sum += x;
        }
        int avg = sum/res.size();
        return avg == res.get(0);
    }
    public List<Integer> dfs(TreeNode node, List<List<Integer>> allPreorders) {
        if (node == null) {
            return new ArrayList<>();
        }

        List<Integer> leftPreorder = dfs(node.left, allPreorders);
        List<Integer> rightPreorder = dfs(node.right, allPreorders);

        List<Integer> currentPreorder = new ArrayList<>();
        currentPreorder.add(node.val);
        currentPreorder.addAll(leftPreorder);
        currentPreorder.addAll(rightPreorder);

        allPreorders.add(currentPreorder);

        return currentPreorder;
    }
}