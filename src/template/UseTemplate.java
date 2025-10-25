package template;

/**
 * @author Adrià Salat
 * Demo:
 * - Shows that the high-level algorithm (prepareRecipe) is fixed in the base class.
 * - Concrete classes customize only the variable steps.
 */
public class UseTemplate {
    public static void main(String[] args) {
        System.out.println("=== Preparing Tea ===");
        HotBeverage tea = new Tea();
        tea.prepareRecipe();
        /*
          Output:
          Boiling water
          Steeping the tea
          Pouring into cup
          Adding lemon
        */

        System.out.println("\n=== Preparing Coffee WITH condiments ===");
        HotBeverage coffeeWith = new Coffee(true);
        coffeeWith.prepareRecipe();
        /*
          Output:
          Boiling water
          Dripping coffee through filter
          Pouring into cup
          Adding sugar and milk
        */

        System.out.println("\n=== Preparing Coffee WITHOUT condiments ===");
        HotBeverage coffeeWithout = new Coffee(false);
        coffeeWithout.prepareRecipe();
        /*
          Output:
          Boiling water
          Dripping coffee through filter
          Pouring into cup
          (no condiments line, hook returned false)
        */
    }
}
