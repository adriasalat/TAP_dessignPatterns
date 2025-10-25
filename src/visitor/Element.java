package visitor;

/**
 * @author Adrià Salat
 * Element: declares 'accept' so a Visitor can perform an operation on it.
 */
public interface Element {
    void accept(Visitor v);
}
