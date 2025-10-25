package template;

/**
 * @author Adrià Salat
 * Template Method pattern:
 * - This abstract class defines the algorithm skeleton in prepareRecipe().
 * - Subclasses customize specific steps by overriding abstract/hook methods.
 */
public abstract class HotBeverage {

    /**
     * Template Method:
     * Defines the invariant sequence of steps to prepare a hot beverage.
     * Final to prevent subclasses from changing the algorithm's order.
     */
    public final void prepareRecipe() {
        boilWater(); // step 1: always boil water
        brew(); // step 2: subclass-specific (abstract)
        pourInCup(); // step 3: common step
        if (customerWantsCondiments()) { // step 4: optional (hook)
            addCondiments(); // subclass-specific (abstract)
        }
    }

    /**
     * Step with default implementation: boiling water is common.
     */
    protected void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Step with default implementation: pouring is common.
     */
    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Abstract step: each beverage defines how to brew.
     */
    protected abstract void brew();

    /**
     * Abstract step: each beverage defines which condiments to add.
     */
    protected abstract void addCondiments();

    /**
     * Hook method (optional step): by default returns true.
     * Subclasses can override to skip condiments (runtime decision).
     */
    protected boolean customerWantsCondiments() {
        return true;
    }
}
