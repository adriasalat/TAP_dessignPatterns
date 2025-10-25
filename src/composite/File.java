package composite;
import java.util.Objects;

/**
 * @author Adrià Salat
 * Leaf: represents an indivisible element with a fixed size.
 */
public class File implements Component {

    private final String name;
    private final int size;

    /**
     * Create a file with a display name and a fixed size in bytes.
     * @param name non-null name for display
     * @param size non-negative size in bytes
     */
    public File(String name, int size) {
        this.name = Objects.requireNonNull(name, "name");
        if (size < 0) throw new IllegalArgumentException("size must be >= 0");
        this.size = size;
    }

    @Override
    public int size() {
        // Leaf: returns its own fixed size
        return size;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "File(" + name + ", " + size + "B)";
    }
}
