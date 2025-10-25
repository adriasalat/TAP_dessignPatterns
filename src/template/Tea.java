package template;

/**
 * @author Adrià Salat
 * Concrete Class: Tea
 * - Implements brew() and addCondiments() in a tea-specific way.
 */
public class Tea extends HotBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
