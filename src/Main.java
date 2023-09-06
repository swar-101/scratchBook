import learn.tree.node.*;
import learn.tree.problem.*;
import learn.tree.traversal.*;

class Main {
    public static void main(String[] args) {
//
//        HashMapExample instance = new HashMapExample();
//        instance.demonstrateHashSet();
//        instance.demonstrateHashMap();
//
//        /*
//        * Linked list.
//        * */
//        LinkedList list = new LinkedList();
//
//        // Insertion
//        list = LinkedList.insert(list, 1);
//        list = LinkedList.insert(list, 3);
//        list = LinkedList.insert(list, 4);
//        list = LinkedList.insert(list, 7);
//        list = LinkedList.insert(list, 2);
//
//        // Print the LinkedList
//        LinkedList.printList(list);

//        Solution solution = new Solution();
//        System.out.println(solution.solve(1));
//        System.out.println(solution.solve(2));
//        System.out.println(solution.solve(4));
//        System.out.println(solution.solve(11));
//        System.out.println(solution.solve(15));
//        System.out.println(solution.solve(40));

//        Solution solution = new Solution();
//        System.out.println(solution.slidingMaximum(List.of(1, 3, -1, -3, 5, 3, 6, 7), 3));


        /*
        *
        *       |``````````| |``````\   |```````|  |```````|   /`````|
        *           |  |     |  |_\  \  |  |`````  |  |`````  /  \```
        *           |  |     |   _   /  |  ```|    |  ```|    \   \
        *           |  |     |  | \  \  |  |____.  |  |____.  __\  \
        *           |__|     |__|  \__\ |_______|  |_______ |______/
        *
        *
        *
        *
        *
        *             8
        *           /   \
        *          /     \
        *         3       7
        *        / \     / \
        *       4   1   21  4
        *
        * */

        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(4);

        Preorder.traverse(root);
        Inorder.traverse(root);
        Postorder.traverse(root);




        /*
        *
        *             6
        *            / \
        *           9   4
        *              / \
        *             8   9
        *              \
        *               3
        *
        * */

        TreeNode rootA = new TreeNode(6);
        rootA.left = new TreeNode(9);
        rootA.right = new TreeNode(4);
        rootA.right.left = new TreeNode(8);
        rootA.right.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        System.out.println("Here we go!");
        System.out.println("Answer: " + Solver.findHeight(rootA));
    }
}