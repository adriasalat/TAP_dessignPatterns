package abstractFactory;

/**
 * @author Adrià Salat
 */
public class UseAbstractFactory {
    public static void main(String[] args) {
        // User only works with the interfaces, he doesn't know the implementations of the methods

        // User choose a type of factory
        AbstractSaluteFactory factory = new EnglishSaluteFactory();

        // User create a salute with the interface
        AbstractSalute salute = factory.createSalute();
        System.out.println(salute.greet("Adria"));

        // Now, if user decides to change the language, he only has to change de salute factory
    }
}
