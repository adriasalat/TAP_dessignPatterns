package decorator;

/**
 * @author Adrià Salat
 * Concrete Decorator: adds milk to a Coffee object.
 * Wraps a Coffee instance and enhances its description and price.
 */
public class MilkDecorator extends Coffee {
    
    // Reference to the wrapped coffee component
    private Coffee client;
    
    /**
     * Wrap an existing Coffee with milk decoration.
     * @param coffee the base coffee to decorate
     */
    public MilkDecorator(Coffee coffee) {
        // Call parent constructor with dummy values
        // (not used, because we delegate to the wrapped object)
        super("", 0);
        this.client = coffee;
    }
    
    /**
     * Override getDescription to append "with milk."
     * Delegates to the wrapped coffee first, then adds.
     * @return enhanced description
     */
    @Override
    public String getDescription() {
        return client.getDescription() + " with milk";
    }
    
    /**
     * Override getPrice to add milk cost (0.5).
     * Delegates to the wrapped coffee and adds the extra.
     * @return enhanced price
     */
    @Override
    public double getPrice() {
        return client.getPrice() + 0.5;
    }
}
