package contest;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class TreeProblems {
    private int sum = 0;
    public TreeNode solve(TreeNode A) {

        if(A != null)  {
            solve(A.right);

            A.val += sum;
            sum = A.val;

            solve(A.left);
        }

        return A;
    }

}
