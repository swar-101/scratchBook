package learn.tree.traversal;

import learn.tree.node.*;

/**
 * The {@code Inorder} class provides methods to perform an in-order traversal on a binary tree.
 * In pre-order traversal, each node is visited in a specific order: left subtree, current node, right subtree.
 * It's called pre-order because you traverse the tree in the order of increasing values.
 * The class offers both a recursive and an iterative method for performing in-order traversal on a given
 * binary tree.
 */

public class Inorder {

    private static boolean firstCall = true;

    // TODO: 15-08-2023 Compute the time complexity and space complexity with clear explanations. 
    public static void traverse(TreeNode root) {
        if(root == null)  return;

        if(firstCall) System.out.print("Inorder traversal: ");
        firstCall = false;

        traverse(root.left);
        System.out.print(root.val + " ");
        traverse(root.right);
    }

    // TODO: 15-08-2023 Complete the iterative code for this traversal. 
    public static void traverseIteratively(TreeNode root) {
        //
    }
}
