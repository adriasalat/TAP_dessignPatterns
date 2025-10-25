package singleton;

/**
 * @author Adrià Salat
 */
public class IdProvider {

    // The single instance
    private static IdProvider idProvider = new IdProvider(); 
    
    private int id = 0;

    //Private constructor makes impossible to create foreign instances
    private IdProvider() {}

    // The only way to get an instance of IdProvider
    public static IdProvider getInstance() {
        return idProvider;
    }

    public int nextId() {
        id++;
        return id;
    }
}
