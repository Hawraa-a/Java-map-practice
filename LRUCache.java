import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    /**
     * TO-DO: Complete the constructor.
     * It should call the superclass constructor with three arguments:
     * initial capacity, load factor, and a boolean for accessOrder.
     * Set accessOrder to true to enable LRU behavior.
     */
    public LRUCache(int capacity) {
        // Your code here. Call the super constructor. Use a load factor of 0.75f.
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    /**
     * TO-DO: Override this method.
     * It is called by put() and putAll(). It should return true if the cache
     * is full and the eldest entry should be removed.
     * @param eldest The least recently accessed entry.
     * @return true if size() is greater than capacity.
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}