package visitor;

/**
 * @author Adrià Salat
 * Concrete Element: another node in the object structure.
 */
public class ElementRectangle implements Element {
    public final double width;
    public final double height;

    public ElementRectangle(double width, double height) {
        this.width = width; this.height = height;
    }

    @Override
    public void accept(Visitor v) {
        // Double dispatch: this line selects Visitor.visit(Rectangle)
        v.visit(this);
    }
}
