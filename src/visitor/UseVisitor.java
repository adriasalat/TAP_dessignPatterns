package visitor;

import java.util.List;

/**
 * @author Adrià Salat
 * Demo:
 * - The object structure: a list of Elements (Circle, Rectangle).
 * - We run two independent operations by passing different Visitors,
 *   without modifying the element classes.
 */
public class UseVisitor {
    public static void main(String[] args) {
        List<Element> shapes = List.of(
            new ElementCircle(2.0),
            new ElementRectangle(3.0, 4.0),
            new ElementCircle(1.5)
        );

        // 1) Compute total area
        VisitorArea area = new VisitorArea();
        for (Element e : shapes) {
            e.accept(area);           // dispatch to the right visit(...)
        }
        System.out.println("Total area = " + area.getTotalArea());

        // 2) Render all shapes (another independent operation)
        VisitorRender render = new VisitorRender();
        for (Element e : shapes) {
            e.accept(render);         // dispatch to the right visit(...)
        }
    }
}
