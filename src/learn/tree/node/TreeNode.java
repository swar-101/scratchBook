package learn.tree.node;

/**
 * The {@code TreeNode} represents a node in a binary tree data structure.
 * It contains information about the node's value, left child, and right child.
 */

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}