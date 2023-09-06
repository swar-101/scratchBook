package learn.tree.problem;

import learn.tree.node.*;

/**
 * This {@code Solver} class provides methods to solve various tree-related problems.
 * This class makes use of the {@code TreeNode} class to represent the nodes of the trees in the problems.
 */
public class Solver {

    // TODO: 15-08-2023 Analyze the time and space complexity.

    /**
     *
     * @param root The root node of the binary tree.
     * @return The height of the binary tree.
     */
    public static int findHeight(TreeNode root) {
        if(root == null) return 0;

        int lHeight = findHeight(root.left);
        int rHeight = findHeight(root.right);

        return Math.max(lHeight, rHeight)+1;
    }


}
