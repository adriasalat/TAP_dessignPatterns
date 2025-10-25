package abstractFactory;

/**
 * @author Adrià Salat
 */
public class SpanishSalute implements AbstractSalute {
    public String greet(String name) {
        return "Hola " + name;
    }
}
