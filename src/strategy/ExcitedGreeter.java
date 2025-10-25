package strategy;

/**
 * @author Adrià Salat
 * Concrete Strategy: adds extra excitement "Hello, <name>!!".
 */
public class ExcitedGreeter implements GreeterStrategy {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!!";
    }
}
