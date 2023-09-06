package learn.heap.implementation;

import java.util.List;

public class MinHeap implements Heap {


    /**
     *
     * @param nodes The list representing the min heap.
     * @param value The index of the element w
     */
    @Override
    public void insert(List<Integer> nodes, int value) {

        nodes.add(value);

        int index = nodes.size() - 1;
        upHeap(nodes, index);
    }
    /**
     * Explanation:
     * The above code represents the insertion operation that involves adding a new element to the
     * heap while also maintaining the heap property.
     *
     * 1. Insertion of the Element :
     *    Start by inserting the new element at the next available position in the heap.
     *    This usually means adding it at the bottom-rightmost position to maintain the complete
     *    binary tree structure.
     *
     * 2. Up-heap Operation :
     *    After inserting the element, perform the up-heap operation.
     *    Compare the value of the inserted element with its parent.
     *    If the value of the inserted element is smaller than the parent's value, swap.
     *    Continue this process iteratively until the element reaches its appropriate position,
     *    satisfying the mean heap property.
     */

    @Override
    public void delete(List<Integer> nodes, int index) {
        int lastIndex = nodes.size() - 1;
        int lastValue = nodes.get(lastIndex);
        nodes.set(index, lastValue);

        downHeap(nodes, index);
    }


    /**
     * Performs the up-heap (heapify-up) operation of the min heap, starting from the specified index.
     * This operation ensures that the heap property is maintained after removing the root or performing
     * other modifications.
     *
     * @param nodes The list representing the min heap.
     * @param index The index of the element from the which the up-heap operation should start.
     */
    @Override
    public void upHeap(List<Integer> nodes, int index) {
        int childIndex = index;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex < 0 && nodes.get(childIndex) < nodes.get(parentIndex)) {
            int temp = nodes.get(childIndex);
            nodes.set(childIndex, nodes.get(parentIndex));
            nodes.set(parentIndex, temp);
            // move up the heap
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
    }
    /**
     * Explanation:
     * The above {@code upHeap} represents the up-heap operation that is useful for performing insert operation
     * on Heaps.
     *
     * 1. Initial Child Index :
     *    We begin with the index of the child node that necessitates the up-heap
     *    operation.
     *    This typically follows the insertion of a new element into the heap structure.
     *
     * 2. Loop Entry :
     *    We enter a loop that persists as long as the child node is not the root of the heap
     *    (index greater than 0).
     *    The loop iterates through the process of moving newly inserted element upwards in the heap
     *    to its appropriate position.
     *
     * 3. Parent Index Calculation :
     *    Within the loop, we calculate the index of the parent node using the formula
     *    `(childIndex-1)/2`.
     *    This calculation identifies the location of the parent node in the heap.
     *
     * 4. Comparison :
     *    We compare the value of the child node with the value of its parent node.
     *    If the child's value is greater than or equal to the parent, it adheres to the heap property.
     *    This condition signifies that the element is in the correct place relative to its parent.
     *
     * 5. Heap property satisfied :
     *    If the value of the child node meets the condition stated above, the heap property is
     *    maintained, and we exit the loop.
     *
     * 6. Swapping :
     *    If the value of the child node is smaller than the value of its parent node, we execute a
     *    swap operation.
     *    This swap positions the child node higher in the heap, replacing its parent.
     *    The purpose of this step is to ensure that the heap property is maintained.
     *
     * 7. Child Index Update :
     *    Following the swap, we update the `childIndex` to the index of the parent node. This adjustment
     *    is crucial for progressing further up the heap in the subsequent loop iteration.
     *
     * 8. Iteration Continuation :
     *    The loop repeats its iterations as long as the child node has not reached the root of the heap.
     *    With each iteration, the child node progresses upwards, ensuring that it finds its rightful
     *    position in the heap.
     */


    /**
     * Performs the down-heap (heapify-down) operation of the min heap, starting from the specified index.
     * This operation ensures that the heap property is maintained after inserting a new element.
     *
     * @param nodes The list representing the min heap.
     * @param index The index of the element from which the down-heap operation should start.
     */
    @Override
    public void downHeap(List<Integer> nodes, int index) {
        int parentIndex = index;
        int leftChildIndex = 2 * parentIndex + 1;

        while (leftChildIndex < nodes.size()) {
            // Compare the parent with both children
            int smallestChildIndex = leftChildIndex;

            int rightChildIndex = leftChildIndex + 1;
            if (rightChildIndex < nodes.size() && nodes.get(rightChildIndex) < nodes.get(leftChildIndex)) {
                smallestChildIndex = rightChildIndex;
            }

            if (nodes.get(parentIndex) <= nodes.get(smallestChildIndex)) {
                break;
            }

            int temp = nodes.get(parentIndex);
            nodes.set(parentIndex, nodes.get(smallestChildIndex));
            nodes.set(smallestChildIndex, temp);

            parentIndex = smallestChildIndex;
            leftChildIndex = 2 * parentIndex + 1;
        }
    }
    /**
     * Explanation:
     * The above {@Code downHeap()} represents the down-heap operation that is useful in performing delete
     * operations on Heaps.
     *
     * 1. Start with the Parent Index :
     *    We start with the index of the parent node and calculate the index of its left child using
     *    formula `2 * parentIndex + 1`.
     *
     * 2. Calculate Left Child Index :
     *    We enter a loop that continues as long as the left child index is within the bounds of the
     *   `nodes` list (i.e., the parent has at least one child).
     *
     * 3. Loop Entry :
     *    The down-heap process is carried out within a loop. The loop endures as long as the left child
     *    index falls within the bounds of the nodes list, signifying that the parent has at least one
     *    child.
     *
     * 4. Comparison and Smallest Child Identification :
     *    Within the loop, we compare the value of parent node with the values of both its left and right
     *    children. This comparison aids in determining which child node has the smallest value. If the
     *    right child exists and its value is smaller, we update the `smallestChildIndex` accordingly.
     *
     * 5. Heap Property Satisfaction Check :
     *    If the value of the parent node is smaller than or equal to the value of the smallest child,
     *    the heap property is preserved, and there is no need for further adjustments. Consequently,
     *    we can break out of the loop.
     *
     * 6. Swap Operation :
     *    If the value of the parent node is greater than the value of the smallest child, we execute
     *    a swap operation. This swap ensures that the parent node is replaced by the smallest child,
     *    adhering to the heap property.
     *
     * 7. Index Updates :
     *    Following the swap, we update the `ParentIndex` to reflect the index of the smallest child.
     *    Additionally, we recalculate the index of the left child to ensure proper navigation within
     *    the heap structure.
     *
     * 8. Continuation of Loop:
     *    The loop persists, enabling the parent node to "bubble down" the heap as needed. Each
     *    iteration further ensure that the parent node finds its accurate position relative to its
     *    children.
     */
}