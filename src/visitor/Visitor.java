package visitor;

/**
 * @author Adrià Salat
 * Visitor: one method per concrete Element type (double dispatch target).
 */
public interface Visitor {
    void visit(ElementCircle c);
    void visit(ElementRectangle r);
}
