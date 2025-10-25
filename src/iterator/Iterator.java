package iterator;

/**
 * @autor Adrià Salat
 * Iterator<T>: defines a uniform, sequential traversal over a collection
 * without exposing its internal representation.
 *
 * Contract:
 * - hasNext(): tells if there is at least one more element to retrieve.
 * - next(): returns the next element and advances the cursor.
 */
public interface Iterator<T> {

    /**
     * @return true if there is another element to read, false otherwise.
     */
    public boolean hasNext();

    /**
     * @return the next element in the traversal.
     * Precondition: call only if hasNext() returned true.
     */
    public T next();
}
