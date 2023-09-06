package learn.heap.implementation;


import java.util.List;

public interface Heap {

    void insert(List<Integer> nodes, int index);

    void delete(List<Integer> nodes, int index);

    void upHeap(List<Integer> nodes, int index);

    void downHeap(List<Integer> nodes, int index);
}
