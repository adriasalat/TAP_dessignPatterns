package proxy;

/**
 * @author Adrià Salat
 * Client demo for the Proxy (Virtual Proxy) pattern.
 *
 * What this shows:
 * 1) The client holds a reference of type Image (the Subject).
 * 2) The client instantiates a ProxyImage with a file name, but the heavy RealImage
 *    is NOT created yet (lazy initialization).
 * 3) On the first call to display(), the proxy constructs RealImage and you will see:
 *      - "Loading test_10mb.jpg"   (from RealImage constructor via loadFromDisk)
 *      - "Displaying test_10mb.jpg" (from RealImage.display)
 * 4) On subsequent display() calls, the proxy reuses the already-created RealImage,
 *    so you will only see:
 *      - "Displaying test_10mb.jpg"
 *    (no loading again).
 * 5) For comparison, we also instantiate RealImage directly to show that it loads
 *    immediately upon construction.
 */
public class UseProxy {

    public static void main(String[] args) {
        System.out.println("=== Using ProxyImage (lazy) ===");

        // Client depends only on the Subject interface (Image)
        Image proxied = new ProxyImage("test_10mb.jpg");

        System.out.println("- First display() call (should trigger loading once):");
        proxied.display(); // Creates RealImage, prints "Loading ..." then "Displaying ..."

        System.out.println("- Second display() call (should NOT load again):");
        proxied.display(); // Reuses cached RealImage, prints only "Displaying ..."

        System.out.println("\n=== Using RealImage directly (eager load in constructor) ===");

        // Direct usage of RealImage: constructor immediately "loads" the image
        Image direct = new RealImage("direct_5mb.jpg"); // Prints "Loading direct_5mb.jpg"

        System.out.println("- Now calling display() on RealImage:");
        direct.display(); // Prints "Displaying direct_5mb.jpg"
    }
}
