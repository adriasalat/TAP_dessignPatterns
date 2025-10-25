package proxy;

/**
 * @author Adrià Salat
 * RealSubject in the Proxy pattern.
 * This class performs the actual work of displaying an image.
 * In this implementation, the constructor simulates an expensive operation
 * by calling loadFromDisk(fileName) when the object is created.
 */
public class RealImage implements Image {

    // Immutable identifier of the resource to display
    private final String fileName;

    /**
     * Build the real image bound to a file name.
     * Note:
     * - Calling loadFromDisk here models the cost of preparing the real resource
     *   (e.g., reading bytes, decoding, allocating memory).
     * - With a virtual proxy, you typically delay constructing this class
     *   until display() is actually needed, saving resources if never used.
     *
     * @param fileName the image file name )
     */
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName); // Simulate expensive I/O at construction time
    }

    /**
     * Render (display) the image.
     * For demonstration purposes, we just print to the console.
     */
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    /**
     * Simulates an expensive loading process (e.g., disk I/O, decoding).
     * Keeping it private encapsulates the loading details inside RealImage.
     *
     * @param fileName the image file name to load
     */
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
