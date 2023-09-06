package learn.linkedList;

public class LinkedList {

    Node head;

    // Linked list Node.
    // This inner class in made static
    // so that `main()` can access it.
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Method to insert a new node.
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data.
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        }
        else {
            // Traverse till the last node
            // and insert the new node there.
            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            // Insert the new node at last node
            lastNode.next = newNode;
        }

        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node currentNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList.
        while (currentNode !=null) {
            // Print the data at current node.
            System.out.print(currentNode + " ");

            // Go to next node.
            currentNode = currentNode.next;
        }
    }
}
