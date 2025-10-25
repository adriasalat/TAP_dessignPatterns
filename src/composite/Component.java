package composite;

/**
 * @author Adrià Salat
 * Component: common interface for both Leaf and Composite.
 * Exposes a uniform operation (size) so clients treat all nodes the same.
 */
public interface Component {
    /**
     * Returns the total size represented by this node.
     * Leaf: its own fixed size. Composite: sum of all children.
     */
    int size();

    /**
     * Optional common operation to get a display name for debugging/printing.
     */
    String name();
}
