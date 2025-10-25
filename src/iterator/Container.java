package iterator;

/**
 * @autor Adrià Salat
 * Container<T>: abstraction for an aggregate/collection capable of providing
 * an Iterator<T>. This keeps clients decoupled from the internal structure.
 */
public interface Container<T> {

    /**
     * @return a fresh iterator for traversing the underlying collection.
     */
    public Iterator<T> getIterator();
}
