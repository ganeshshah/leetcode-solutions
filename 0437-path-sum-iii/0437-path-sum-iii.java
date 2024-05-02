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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        
        // Call the recursive function to start traversing the tree
        return dfs(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    // Recursive function to traverse the tree and count paths
    private int dfs(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }
        
        int count = 0;
        // Check if the current node itself satisfies the targetSum
        if (node.val == targetSum) {
            count++;
        }
        
        // Continue the path downward with the left and right children
        count += dfs(node.left, targetSum - node.val);
        count += dfs(node.right, targetSum - node.val);
        
        return count;
    }
}