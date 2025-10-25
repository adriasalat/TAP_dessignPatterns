package abstractFactory;

/**
 * @author Adrià Salat
 */
public class EnglishSalute implements AbstractSalute{
    public String greet(String name) {
        return "Hello " + name;
    }
}
