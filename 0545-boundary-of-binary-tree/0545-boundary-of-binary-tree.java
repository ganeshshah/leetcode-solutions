import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        return boundaryTraversal(root);
    }
    
    private void printLeftBoundary(TreeNode node, List<Integer> result) {
        if (node != null) {
            if (node.left != null) {
                result.add(node.val);
                printLeftBoundary(node.left, result);
            } else if (node.right != null) {
                result.add(node.val);
                printLeftBoundary(node.right, result);
            }
            // do nothing if it is a leaf node, because leaf nodes are printed by     printLeafNodes
        }
    }
    
    private void printLeafNodes(TreeNode node, List<Integer> result) {
        if (node != null) {
            printLeafNodes(node.left, result);
            if (node.left == null && node.right == null)
                result.add(node.val);
            printLeafNodes(node.right, result);
        }
    }

    private void printRightBoundary(TreeNode node, List<Integer> result) {
        if (node != null) {
            if (node.right != null) {
                printRightBoundary(node.right, result);
                result.add(node.val);
            } else if (node.left != null) {
                printRightBoundary(node.left, result);
                result.add(node.val);
            }
            // do nothing if it is a leaf node, because leaf nodes are printed by printLeafNodes
        }
    }

private List<Integer> boundaryTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
        result.add(root.val);
        if (root.left != null || root.right != null) { // If the root has children
            printLeftBoundary(root.left, result);
            printLeafNodes(root, result);
            printRightBoundary(root.right, result);
        }
    }
    return result;
}

}
