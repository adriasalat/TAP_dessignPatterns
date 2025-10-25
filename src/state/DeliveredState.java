package state;

/**
 * @author Adrià Salat
 * Concrete State: package has been delivered to the customer.
 */
public class DeliveredState implements PackageState {

    @Override
    public void apply(PackageContext pkg) {
        // Final state: no further transitions
        System.out.println("[DeliveredState] Package already delivered. No further transitions.");
        // Optionally, keep the same state (idempotent)
        pkg.setState(this);
    }

    @Override
    public String name() {
        return "DELIVERED";
    }
}
