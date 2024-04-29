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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();
        
        if (root == null) {
               return result;
         }
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            
            TreeNode node = stack.pop();
            result.add(node.val);
            
            if (node.right != null)
                stack.push(node.right);
            
            if (node.left != null)
                stack.push(node.left); 
        }
        
        return result;
        
    }
}