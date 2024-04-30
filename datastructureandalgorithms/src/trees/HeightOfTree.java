package trees;

import trees.iterativetraversals.IterativeTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(int val) {
        this.val = val;
    }
}

public class HeightOfTree {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(5);


        int heightOfTree = findHeightOfTheTree(root);
        System.out.println("Height of the tree recursively is : " + heightOfTree);

        System.out.println("Height of the tree using queue is : " + heightOfBinaryTree(root));


    }

    private static int findHeightOfTheTree(TreeNode root) {

        if (root == null)
            return 0;

        int lh = findHeightOfTheTree(root.left);
        int rh = findHeightOfTheTree(root.right);

        return 1 + Math.max(lh, rh);
    }

    // using a queue
    public static int heightOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                // Add left and right children to the queue if they exist
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            // Increment height after processing all nodes at the current level
            height++;
        }

        return height;
    }
}
