package singleton;

/**
 * @author Adrià Salat
 */
public class UseSingleton {
    public static void main(String[] args) {
        // Only instance of an id provider
        IdProvider idProvider1 = IdProvider.getInstance();
        System.out.println(idProvider1.nextId()); // returns 1
        System.out.println(idProvider1.nextId()); // returns 2

        // This instance is the same that the previous one
        // We are getting the same instance in 2 different ways
        IdProvider idProvider2 = IdProvider.getInstance();
        System.out.println(idProvider2.nextId()); // returns 3

        // Same if we do this
        IdProvider idProvider3 = idProvider1;
        System.out.println(idProvider3.nextId()); // returns 4
    }
}