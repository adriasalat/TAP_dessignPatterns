package abstractFactory;

/**
 * @author Adrià Salat
 */
public class SpanishSaluteFactory implements AbstractSaluteFactory {
    public AbstractSalute createSalute() {
        return new SpanishSalute();
    }
}
