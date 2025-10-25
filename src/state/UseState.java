package state;

/**
 * @author Adrià Salat
 * Demo: shows State transitions ORDERED -> RECEIVED -> DELIVERED,
 * and safe behavior if 'next()' is called after delivery.
 */
public class UseState {
    public static void main(String[] args) {
        PackageContext pkg = new PackageContext(new OrderedState());

        System.out.println("Initial status: " + pkg.status());
        pkg.next(); // Ordered -> Received

        System.out.println("Current status: " + pkg.status());
        pkg.next(); // Received -> Delivered

        System.out.println("Current status: " + pkg.status());
        pkg.next(); // Delivered -> stays Delivered (no-op with message)

        System.out.println("Final status: " + pkg.status());
    }
}
