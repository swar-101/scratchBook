package learn.tree.traversal;

import learn.tree.node.*;

/**
 * The {@code Preorder} class provides methods to perform an in-order traversal on a binary tree.
 * In pre-order traversal, each node is visited in a specific order: current node, left subtree, right subtree.
 * It's called "pre-order" because you visit the current node before visiting its subtree.
 * The class offers both a recursive and an iterative method for performing pre-order traversal on a given
 * binary tree.
 */

public class Preorder {

    private static boolean firstCall = true;

    // TODO: 15-08-2023 Compute the time complexity and space complexity with clear explanations.
    public static void traverse(TreeNode root) {
        if (root == null) return;

        if (firstCall) System.out.print("Pre-order traversal: ");
        firstCall = false;

        System.out.print(root.val + " ");
        traverse(root.left);
        traverse(root.right);
    }

    // TODO: 15-08-2023 Complete the iterative code for this traversal.
    public static void traverseIteratively(TreeNode root) {
        //
    }
}
