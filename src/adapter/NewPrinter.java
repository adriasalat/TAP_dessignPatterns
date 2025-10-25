package adapter;

/**
 * @author Adrià Salat
 * Target: the interface the client knows and depends on.
 * Clients will call this API regardless of the underlying printer implementation.
 */
public interface NewPrinter {
    /**
     * Prints the given text and returns the same text (for demonstration).
     * @param text text to print
     * @return the printed text
     */
    String print(String text);
}

