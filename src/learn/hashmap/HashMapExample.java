package learn.hashmap;

import java.util.*;
import java.util.concurrent.*;

public class HashMapExample {

    /**
     * Java HashMap is similar to HashTable, but there is a key difference in terms
     * of synchronization.
     * It allows to store the null keys as well, but there should be only one null
     * key object and there can be any number of null values.
     * This class makes no guarantee as to the order of map. To use this class and
     * its method, you need to import `priorityqueue.util.HashMap` package or its superclass.
     */

    /**
     * Difference between `HashMap` and `HashSet` in Java.
     *
     * 1. Implementation: `HashMap` is an implementation of the `Map` interface.
     *                    `HashSet` is an implementation of the `Set` interface.
     *
     * 2. Internal
     *    implementation: `HashMap` does not use `HashSet` or any other `Set`
     *                     for its implementation.
     *                    `HashSet` internally uses `HashMap` for its
     *                     implementation.
     *
     * 3. Storage
     *    of elements   : `HashMap` stores elements in the form of key-value pairs.
     *                     Each element has its corresponding key, which is required
     *                     for its implementation.
     *                    `HashSet` stores only objects; no key-value pairs are maintained.
     *
     * 4. Method
     *    to
     *    add elements  : `put()` method of `HashMap` is used to add elements to
     *                    `HashMap`.
     *                    `add()` method of `HashSet` is used to add elements to
     *                    `HashSet`.
     *
     * 5. Index
     *    performance   : `HashMap`, due to its unique key, is faster in retrieving
     *                     elements during iteration.
     *                    `HashSet` is completely based on objects, so it is slower
     *                     compared to `HashMap`.
     *
     * 6. Null Allowed  : Single null key and any number of null values can be inserted
     *                    in `HashMap` without any restrictions.
     *                   `HashSet` allows only one null value in its collection, after
     *                    which no null value is allowed to be added.
     */

    public void demonstrateHashSet() {

        HashSet<String> hs =  new HashSet<>();

        hs.add("Miami");
        hs.add("Barcelona");
        hs.add("Rosario");
        System.out.println("Before adding duplicate values: " + hs);

        // Let's add two duplicate values.
        hs.add("Miami");
        hs.add("Rosario");
        System.out.println("After adding duplicate values:" + hs);

        // Let's add two null values.
        hs.add(null);
        hs.add(null);
        System.out.println("After adding null values.. " + hs);
        System.out.println("As you can see, "
                + " the duplicate values were not added,"
                + " only one null value was allowed.");
    }


    public void demonstrateHashMap() {

        java.util.HashMap<Integer, String> hm = new java.util.HashMap();
        hm.put(12, "Marcelo");
        hm.put(2, "Cafu");
        hm.put(7, "Rivaldo");

        System.out.println("HashMap object output: " + hm);

        hm.put(12, "David Luiz");
        System.out.println("After inserting a duplicate key: " + hm);

        System.out.println("HashMap replaces the old value \"Marcelo\" with the new value " +
                "\"David Luiz\" associated with that key.");
    }

    /*
    * Concurrent Hash Maps:
    * Concurrent Hash Maps are a type of thread-safe map data structure in
    * Java that allows multiple threads to access multiple threads to
    * access and modify the map concurrently without the need for
    * explicit synchronization.
    *
    * 1. Thread Safety.
    * 2. Concurrency.
    * 3. Performance.
    * 4. Atomic Operations.
    * 5. Iterators.
    * 6. Size Estimation.
    * 7. Concurrent Level.
    * 8. Bulk operations.
    * 9. Search operations.
    * 10.Key Set Views.
    * 11.Default values.
    * 12.Serializable.
    *
    *  */

    public void demonstrateConcurrentHashMaps () {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);


    }

}
