package state;

/**
 * @author Adrià Salat
 * Concrete State: package is now at the warehouse / in transit.
 */
public class ReceivedState implements PackageState {

    @Override
    public void apply(PackageContext pkg) {
        System.out.println("[ReceivedState] Package at warehouse. Moving to DELIVERED...");
        // Transition to the next state
        pkg.setState(new DeliveredState());
    }

    @Override
    public String name() {
        return "RECEIVED";
    }
}
