package template;

/**
 * @author Adrià Salat
 * Concrete Class: Coffee
 * - Implements brew() and addCondiments() in a coffee-specific way.
 * - Also overrides the hook to show how to skip condiments if desired.
 */
public class Coffee extends HotBeverage {

    private final boolean withSugarAndMilk;

    /**
     * Configure at construction time whether to add condiments.
     */
    public Coffee(boolean withSugarAndMilk) {
        this.withSugarAndMilk = withSugarAndMilk;
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    /**
     * Hook override: conditionally add condiments based on user preference.
     */
    @Override
    protected boolean customerWantsCondiments() {
        return withSugarAndMilk;
    }
}