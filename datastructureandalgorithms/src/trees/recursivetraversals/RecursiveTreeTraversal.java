package trees.recursivetraversals;

import java.util.LinkedList;
import java.util.Queue;

public class RecursiveTreeTraversal {

    Node root;

    RecursiveTreeTraversal() {
        root = new Node();
    }

    class Node {
        Node left;
        Node right;
        Integer key;
    }

    // Left, Root, Right
    void printInorder(Node node) {
        if (node == null) return;
        // First recur on left child
        printInorder(node.left);

        // Then print the data of node
        System.out.print(node.key + " ");

        // Now recur on right child
        printInorder(node.right);
    }


    // Root, Left, Right
    void printPreorder(Node node) {
        if (node == null) return;

        // First print data of node
        System.out.print(node.key + " ");

        // Then recur on left subtree
        printPreorder(node.left);

        // Now recur on right subtree
        printPreorder(node.right);
    }


    // Left, Right, Root
    void printPostorder(Node node) {
        if (node == null) return;
        // First recur on left subtree
        printPostorder(node.left);

        // Then recur on right subtree
        printPostorder(node.right);

        // Now deal with the node
        System.out.print(node.key + " ");
    }


    // Given a binary tree. Print
// its nodes in level order
// using array for implementing queue
    void printLevelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll() removes the present head.
            Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}
