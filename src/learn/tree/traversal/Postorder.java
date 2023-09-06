package learn.tree.traversal;

import learn.tree.node.*;

/**
 * The {@code Postorder} class provides methods to perform a post-order traversal on a binary tree.
 * In post-order traversal, is node is visited in a specific order: left subtree, right subtree, current node.
 * It's called post-order because you visit the node after visiting both the subtrees.
 * The class offers both a recursive and an iterative method for performing post-order traversal on a given
 * binary tree.
 */

public class Postorder {

    private static boolean firstCall = true;

    // TODO: 15-08-2023 Compute the time complexity and space complexity with clear explanations.
    public static void traverse(TreeNode root) {
        if(root == null) return;

        if (firstCall) System.out.print("Post-order traversal: ");
        firstCall = false;

        traverse(root.left);
        traverse(root.right);
        System.out.print(root.val + " ");
    }

    // TODO: 15-08-2023 Complete the iterative code for this traversal.
    public static void traverseIteratively(TreeNode root) {
        //
    }
}
