package trees.iterativetraversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeTraversal {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    // Root, Left, Right
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();
            result.add(node.val);

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }

        return result;

    }


    public void inorderIterative(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current subtree
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current is now null, pop the last node added to the stack
            current = stack.pop();
            System.out.print(current.val + " ");

            // Move to the right subtree
            current = current.right;
        }
    }

    // Method to perform iterative postorder traversal using 2 stacks
    public void postorderIterative(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        // Push the root node onto the first stack
        stack1.push(root);

        // Traverse the tree while the first stack is not empty
        while (!stack1.isEmpty()) {
            TreeNode current = stack1.pop();
            stack2.push(current); // Push the popped node onto the second stack

            // Push left and right children of the popped node onto the first stack
            if (current.left != null)
                stack1.push(current.left);
            if (current.right != null)
                stack1.push(current.right);
        }

        // Print nodes in postorder sequence by popping from the second stack
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
        }
    }

}
