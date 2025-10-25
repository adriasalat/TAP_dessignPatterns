package visitor;

/**
 * @author Adrià Salat
 * Concrete Element: knows how to dispatch to the correct Visitor method.
 */
public class ElementCircle implements Element {
    public final double radius;

    public ElementCircle(double radius) { this.radius = radius; }

    @Override
    public void accept(Visitor v) {
        // Double dispatch: this line selects Visitor.visit(Circle)
        v.visit(this);
    }
}
