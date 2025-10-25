package state;

/**
 * @author Adrià Salat
 * Context: holds a reference to the current state and exposes a stable API
 * to clients. Behavior changes by swapping the current PackageState.
 */
public class PackageContext {

    private PackageState state;

    /**
     * Build a package with an initial state.
     * @param initial initial PackageState (e.g., new OrderedState())
     */
    public PackageContext(PackageState initial) {
        this.state = initial;
    }

    /**
     * Advance the workflow: delegate to current state's behavior.
     */
    public void next() {
        state.apply(this);
    }

    /**
     * Assign a new state; used by states themselves to transition.
     */
    public void setState(PackageState newState) {
        this.state = newState;
    }

    /**
     * Access current state's name (for logging/tracing).
     */
    public String status() {
        return state.name();
    }
}
