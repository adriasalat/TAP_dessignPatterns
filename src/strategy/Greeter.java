package strategy;

/**
 * @author Adrià Salat
 * Context: keeps a reference to a GreeterStrategy and delegates the behavior.
 * Swapping the strategy changes the algorithm without changing this class.
 */
public class Greeter {

    private GreeterStrategy strategy;

    /**
     * Build with an initial strategy (e.g., new PlainGreeter()).
     */
    public Greeter(GreeterStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Change strategy at runtime.
     */
    public void setStrategy(GreeterStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Produce the greeting by delegating to the current strategy.
     */
    public void sayHello(String name) {
        if (strategy == null) {
            throw new IllegalStateException("No GreeterStrategy configured");
        }
        System.out.println(strategy.greet(name));
    }
}
