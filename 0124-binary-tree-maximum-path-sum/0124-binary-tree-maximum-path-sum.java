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
    
    
    private Integer maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
    heightOfTree(root);
    return maxSum;
    }
    
    private Integer heightOfTree(TreeNode root){
        
        if(root == null)
            return 0;
        
        int lv = Math.max(0,heightOfTree(root.left));
        int rv = Math.max(0,heightOfTree(root.right));
        maxSum = Math.max(maxSum,lv+rv+root.val);
        return root.val + Math.max(lv,rv);
        
    }
}