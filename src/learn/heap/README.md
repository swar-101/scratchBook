# Heaps

## Min Heap


## Max Heap


## Heapify

Heapify refers to the process of rearranging the elements in a data structure called heap so that they follow a 
specific order or property. The goal of heapify is to ensure that the heap maintains its structure efficiently, 
allowing for quick access to the smallest or largest element, depending on whether it's a min heap or a max heap.

In essence, heapify ensures that the heap maintains its orders, with the smallest or the largest element at the root,
making operations like finding the minimum or maximum element efficient.

Heapify can be broken down into two main operations: 

### 1. Heapify-up (Up-heap) _[Used after Node Insertion]_

1. This operation is performed after inserting new element into the heap.
2. It involves comparing the newly inserted element with its parent and swapping them if the parent is smaller 
   or larger depending on whether if it's a max heap or a min heap respectively. 
3. This swapping continues upward in the heap until the element finds its appropriate position.

The up-heap operation step-by-step:

1. **Start:** Begin with newly inserted element that requires the "up-heap" operation. This element is typically added 
   at the bottom of the heap.

2. **Compare With Parent:** Compare the element with its parent node. If it's a min heap, compare it with the parent to ensure if 
   its smaller; If it's a max heap, compare it to guarantee it's larger.

3. **Swap If Needed:** If the element violates the heap property (it's smaller than its parent in a min heap, or larger in a max 
   heap) perform a swap. This action causes the element to "bubble-up", effectively replacing its parent.

4. **Repeat:** Reiterate steps 2 and 3 using the new position of the swapped element (the parent's position). Continue this process
   until the element reaches a position where it's appropriately positioned compared to its parent. This is usually when the element
   satisfies the heap property.
   

---
### 2. Heapify-down (Down-heap) _[Used after Node Deletion]_

1. This operation is performed after removing the root element from the heap.
2. It involves taking the last element of the heap and placing it at the root, then comparing it with its children
   and swapping with the smaller or larger child depending on whether if it's a min heap or a max heap respectively.
3. This swapping continues downward in the heap until the element finds its appropriate position.

The down-heap operation step-by-step:

1. **Start:** Begin with the element that needs to be "down-heaped". This element is typically the root element, especially when 
   you're removing the root during operations like extracting the minimum (for min heap) or the maximum (for max heap).

2. **Compare:** Compare the element with its children. If it's a min heap, find the smaller of the two children; if it's a max heap,
   find the larger of the two children. 

3. **Swap If Needed:** If the element is smaller (for min heap) or larger (for max heap) than the chosen child, 
   swap the element with that child. 
   This ensures that the smaller (or larger) child to "bubble up" towards the root, replacing the parent element.
   
4. **Repeat:** Reiterate steps 2 and 3 with new position of the swapped element. Continue this process until the element reaches a 
   position where it's smaller (for min heap) or larger (for max heap) than its children or until it becomes a leaf 
   node (has no node).
---

