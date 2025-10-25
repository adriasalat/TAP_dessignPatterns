package visitor;

/**
 * @author Adrià Salat
 * Concrete Visitor: renders a textual description for each shape.
 */
public class VisitorRender implements Visitor {
    @Override
    public void visit(ElementCircle c) {
        System.out.println("Render circle radius=" + c.radius);
    }

    @Override
    public void visit(ElementRectangle r) {
        System.out.println("Render rectangle " + r.width + "x" + r.height);
    }
}
