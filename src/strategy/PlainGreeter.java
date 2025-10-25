package strategy;

/**
 * @author Adrià Salat
 * Concrete Strategy: plain "Hello, <name>" style.
 */
public class PlainGreeter implements GreeterStrategy {
    @Override
    public String greet(String name) {
        return "Hello, " + name;
    }
}
