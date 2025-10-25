package abstractFactory;

/**
 * @author Adrià Salat
 */
public class EnglishSaluteFactory implements AbstractSaluteFactory{
    public AbstractSalute createSalute() {
        return new EnglishSalute();
    }
}
