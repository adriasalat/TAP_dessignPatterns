package state;

/**
 * @author Adrià Salat
 * Concrete State: package has been ordered by the customer.
 */
public class OrderedState implements PackageState {

    @Override
    public void apply(PackageContext pkg) {
        System.out.println("[OrderedState] Package ordered. Moving to RECEIVED...");
        // Transition to the next state
        pkg.setState(new ReceivedState());
    }

    @Override
    public String name() {
        return "ORDERED";
    }
}
