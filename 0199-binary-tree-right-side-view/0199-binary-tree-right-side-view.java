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
    
    List<Integer> result = new ArrayList<>(); 
    
    public List<Integer> rightSideView(TreeNode root) {
        
    rightView(root);
        return result;
         
    }
    
    void rightView(TreeNode root){
        
        if(root == null)
            return;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int queueSize = queue.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<queueSize;i++){
                
                TreeNode node = queue.poll();
                list.add(node.val);
                
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                
            }
            
            result.add(list.get(list.size()-1));
            
        }
        
        
    }
}