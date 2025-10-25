package strategy;

/**
 * @author Adrià Salat
 * Concrete Strategy: GREETING IN UPPERCASE.
 */
public class UpperGreeter implements GreeterStrategy {
    @Override
    public String greet(String name) {
        return ("HELLO, " + name).toUpperCase();
    }
}
