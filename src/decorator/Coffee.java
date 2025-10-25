package decorator;

/**
 * @author Adrià Salat
 * Component: base class that represents a simple beverage.
 * Decorators will extend this class and wrap instances of it
 * to add features dynamically.
 */
public class Coffee {
    
    private String description;
    private double price;
    
    /**
     * Constructor for a basic coffee with description and price.
     * @param description text describing the coffee
     * @param price base cost
     */
    public Coffee(String description, float price) {
        this.description = description;
        this.price = price;
    }
    
    /**
     * Returns the description of this coffee.
     * Decorators will extend this to append their own text.
     * @return description string
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Returns the cost of this coffee.
     * Decorators will extend this to add their cost.
     * @return price as double
     */
    public double getPrice() {
        return price;
    }
}
