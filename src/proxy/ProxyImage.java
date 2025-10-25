package proxy;

/**
 * @author Adrià Salat
 * Proxy (Virtual Proxy) that implements the same Subject interface (Image)
 * and controls access to the RealSubject (RealImage).
 *
 * Behavior:
 * - Lazy initialization: delays creating the RealImage until the first time
 *   display() is actually invoked. This saves resources if the image might
 *   never be displayed.
 * - Caching: once the RealImage is created, subsequent display() calls
 *   reuse the same instance, avoiding repeated expensive work.
 */
public class ProxyImage implements Image {

    // Cached reference to the real subject; null until first display() call
    private RealImage realImage;

    // Identifier of the resource to be displayed; passed to RealImage when needed
    private final String fileName;

    /**
     * Build the proxy with the file name but DO NOT create the RealImage yet.
     * @param fileName image file name 
     */
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Client-facing operation: ensure the real subject exists, then delegate.
     * - If this is the first call, instantiate RealImage with the stored fileName.
     * - Otherwise, just forward the call to the cached RealImage.
     */
    @Override
    public void display() {
        if (realImage == null) {
            // First use: create the heavy/real object on demand
            realImage = new RealImage(fileName);
        }
        // Delegate to the real subject
        realImage.display();
    }
}
