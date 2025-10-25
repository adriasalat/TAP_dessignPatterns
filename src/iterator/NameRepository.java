package iterator;

/**
 * @autor Adrià Salat
 * Concrete Aggregate that stores names internally (here, in a fixed array)
 * and returns a dedicated iterator to traverse them.
 *
 * Encapsulation:
 * - The internal array is private and never exposed.
 * - Clients must obtain an Iterator<String> to read elements sequentially.
 */
public class NameRepository implements Container<String> {

    private final String[] names;

    /**
     * Build a repository with a provided array of names.
     * Defensive choice: the reference is stored as-is; optionally you could clone.
     * @param names array of names
     */
    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator<String> getIterator() {
        // Return a new iterator each time, starting at index 0
        return new NameIterator();
    }

    /**
     * Concrete Iterator:
     * - Maintains a cursor (index) into the enclosing names array.
     * - Implements hasNext/next without exposing the array itself.
     */
    private class NameIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            // Precondition: caller should have checked hasNext()
            return names[index++];
        }
    }
}
