package visitor;

/**
 * @author Adrià Salat
 * Concrete Visitor: computes area for each shape type.
 * Adding new operations (e.g., perimeter) = new Visitor class, no changes to shapes.
 */
public class VisitorArea implements Visitor {
    private double total = 0.0;

    @Override
    public void visit(ElementCircle c) {
        total += Math.PI * c.radius * c.radius;
    }

    @Override
    public void visit(ElementRectangle r) {
        total += r.width * r.height;
    }

    public double getTotalArea() { return total; }
}
