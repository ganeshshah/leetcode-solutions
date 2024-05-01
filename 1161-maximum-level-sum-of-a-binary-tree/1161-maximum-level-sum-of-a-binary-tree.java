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
    private Integer levelWithMaxSum = 1;
    
    public int maxLevelSum(TreeNode root) {
        
        findMaxLevelSum(root);
        
        return levelWithMaxSum;
    }
    
    void findMaxLevelSum(TreeNode root){
        
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        int level = 0;
        
        while(queue.size() > 0){
            level++;
            
            int size = queue.size();
            int levelSum = 0;
            
            for(int i=0; i< size; i++){
                
                TreeNode node = queue.poll();
                levelSum += node.val;
                
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
                
            }
            
           if(levelSum > maxSum){
               levelWithMaxSum = level;
               maxSum = levelSum;
           }
            
        }
        
        
    }
}