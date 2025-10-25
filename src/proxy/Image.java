package proxy;

/**
 * @author Adrià Salat
 * Subject interface for the Proxy pattern.
 *
 * Both the RealSubject (e.g., RealImage) and the Proxy (e.g., ProxyImage)
 * implement this interface so that clients can depend only on the abstraction.
 *
 * Key idea:
 * - The client holds a reference of type Image and invokes display()
 *   without knowing whether it's talking to a proxy or the real object.
 * - This enables introducing cross‑cutting behavior (access control, logging,
 *   caching, remote indirection, rate limiting, etc.) inside the proxy
 *   without changing client code or the real subject’s business logic.
 *
 * Contract:
 * - Any implementation must provide a concrete behavior for display(),
 *   which represents the operation the client cares about (rendering/printing).
 */
interface Image {

    /**
     * Render or show the image.
     * Implementations (RealSubject/Proxy) decide how this is performed.
     */
    void display();
}
