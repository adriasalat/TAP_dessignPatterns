package state;

/**
 * @author Adrià Salat
 * State interface: defines the behavior that varies with the object's state.
 * Each concrete state will implement how to handle the transition.
 */
public interface PackageState {
    /**
     * Apply this state's behavior and decide the next state if any.
     * @param pkg the context
     */
    void apply(PackageContext pkg);

    /**
     * Human-readable name of the state (for logging/output).
     */
    String name();
}
