package decorator;

/**
 * @author Adrià Salat
 * Client: demonstrates the Decorator pattern by building
 * different coffee combinations at runtime.
 */
public class UseDecorator {
    
    public static void main(String[] args) {
        
        System.out.println("=== Decorator Pattern Demo ===\n");
        
        // 1. Plain coffee (no decorators)
        Coffee plainCoffee = new Coffee("Simple coffee", 2.0f);
        System.out.println("1. " + plainCoffee.getDescription());
        System.out.println("   Price: $" + plainCoffee.getPrice());
        System.out.println();
        
        // 2. Coffee with milk
        Coffee coffeeWithMilk = new MilkDecorator(
            new Coffee("Simple coffee", 2.0f)
        );
        System.out.println("2. " + coffeeWithMilk.getDescription());
        System.out.println("   Price: $" + coffeeWithMilk.getPrice());
        System.out.println();
        
        // 3. Coffee with sugar
        Coffee coffeeWithSugar = new SugarDecorator(
            new Coffee("Simple coffee", 2.0f)
        );
        System.out.println("3. " + coffeeWithSugar.getDescription());
        System.out.println("   Price: $" + coffeeWithSugar.getPrice());
        System.out.println();
        
        // 4. Coffee with milk and sugar (milk first, then sugar)
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(
            new MilkDecorator(
                new Coffee("Simple coffee", 2.0f)
            )
        );
        System.out.println("4. " + coffeeWithMilkAndSugar.getDescription());
        System.out.println("   Price: $" + coffeeWithMilkAndSugar.getPrice());
        System.out.println();
        
        // 5. Coffee with sugar and milk (sugar first, then milk)
        Coffee coffeeWithSugarAndMilk = new MilkDecorator(
            new SugarDecorator(
                new Coffee("Simple coffee", 2.0f)
            )
        );
        System.out.println("5. " + coffeeWithSugarAndMilk.getDescription());
        System.out.println("   Price: $" + coffeeWithSugarAndMilk.getPrice());
        System.out.println();
        
        // 6. Double milk (decorator can be applied multiple times)
        Coffee doubleMilkCoffee = new MilkDecorator(
            new MilkDecorator(
                new Coffee("Simple coffee", 2.0f)
            )
        );
        System.out.println("6. " + doubleMilkCoffee.getDescription());
        System.out.println("   Price: $" + doubleMilkCoffee.getPrice());
        System.out.println();
        
        System.out.println("=== Pattern demonstrates dynamic composition ===");
    }
}