package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Adrià Salat
 * Composite: contains child Components (files or directories) and
 * implements the same interface, delegating/combining child results.
 */
public class Directory implements Component {

    private final String name;
    private final List<Component> children;

    /**
     * Create a directory with a display name and an empty list of children.
     * @param name non-null directory name
     */
    public Directory(String name) {
        this.name = Objects.requireNonNull(name, "name");
        this.children = new ArrayList<>();
    }

    /**
     * Add a child component (either a File or another Directory).
     * @param child non-null component
     */
    public void add(Component child) {
        children.add(Objects.requireNonNull(child, "child"));
    }

    /**
     * Remove a child component if present.
     * @param child component to remove
     * @return true if removed
     */
    public boolean remove(Component child) {
        return children.remove(child);
    }

    /**
     * Expose a read-only snapshot of current children.
     */
    public List<Component> children() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public int size() {
        // Composite: sum recursively the size of all children
        int total = 0;
        for (Component c : children) {
            total += c.size();
        }
        return total;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "Directory(" + name + ", children=" + children.size() + ")";
    }
}