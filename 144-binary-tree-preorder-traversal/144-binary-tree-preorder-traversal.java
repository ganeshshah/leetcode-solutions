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
        
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> li = new ArrayList<>();
        
        if (root == null) {
            return li;
        }
         
        stack.push(root);
        
        while(!stack.empty())
        {
            TreeNode node = stack.peek();
            stack.pop();
             li.add(node.val);
            if(node.right != null)
                stack.push(node.right);
            
            if(node.left != null)
                stack.push(node.left);  
            
           
        }
        
        
        return li;
        
    }
}