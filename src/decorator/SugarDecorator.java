package decorator;

/**
 * @author Adrià Salat
 * Concrete Decorator: adds sugar to a Coffee object.
 * Wraps a Coffee instance and enhances its description and price.
 */
public class SugarDecorator extends Coffee {
    
    // Reference to the wrapped coffee component
    private Coffee client;
    
    /**
     * Wrap an existing Coffee with sugar decoration.
     * @param coffee the base coffee to decorate
     */
    public SugarDecorator(Coffee coffee) {
        // Call parent constructor with dummy values
        // (not used, because we delegate to the wrapped object)
        super("", 0);
        this.client = coffee;
    }
    
    /**
     * Override getDescription to append "with sugar."
     * Delegates to the wrapped coffee first, then adds.
     * @return enhanced description
     */
    @Override
    public String getDescription() {
        return client.getDescription() + " with sugar";
    }
    
    /**
     * Override getPrice to add sugar cost (0.2).
     * Delegates to the wrapped coffee and adds the extra.
     * @return enhanced price
     */
    @Override
    public double getPrice() {
        return client.getPrice() + 0.2;
    }
}
