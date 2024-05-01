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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        if (root == null) {
        return new ArrayList<List<Integer>>();
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean rightToLeft = true;
        queue.add(root);
        
        
        
        while(!queue.isEmpty()){
            
            List<Integer> levelTraversalResult = new ArrayList<>();
            
            int queueSize = queue.size();
            
            for(int i=0; i<queueSize; i++){
                TreeNode frontNode = queue.poll();
                
                levelTraversalResult.add(frontNode.val);
                
                if(frontNode.left!=null){
                    queue.add(frontNode.left);
                }
                
                if(frontNode.right!=null){
                     queue.add(frontNode.right);
                }
            }
            
            if(rightToLeft){
                rightToLeft = false;
            }else{
                Collections.reverse(levelTraversalResult);
                rightToLeft = true;
            }
            
            result.add(levelTraversalResult);
        }
        
        return result;
        
    }
}