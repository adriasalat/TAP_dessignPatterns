package adapter;

/**
 * @author Adrià Salat
 * Adapter: implements the Target interface and internally uses the Adaptee.
 * It translates Target calls (print) into Adaptee calls (printText).
 */
public class OldPrinterAdapter implements NewPrinter {

    // Composition: keep a reference to the Adaptee we delegate to
    private final OldPrinter adaptee;

    /**
     * Build an adapter around a given OldPrinter.
     * @param adaptee the legacy printer to adapt
     */
    public OldPrinterAdapter(OldPrinter adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * Target API implementation that forwards the call to the Adaptee.
     * @param text text to print
     * @return the printed text
     */
    @Override
    public String print(String text) {
        // Translate print() -> printText() and delegate
        return adaptee.printText(text);
    }
}
