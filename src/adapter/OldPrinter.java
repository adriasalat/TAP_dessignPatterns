package adapter;

/**
 * @author Adrià Salat
 * Adaptee: an existing class with an incompatible API.
 * We cannot (or do not want to) change this class signature.
 */
public class OldPrinter {

    /**
     * Legacy method that prints text using the old API.
     * Note the method name is different from the Target interface.
     * @param text text to print
     * @return the printed text
     */
    public String printText(String text) {
        System.out.println("[OldPrinter] Printing: " + text);
        return text;
    }
}
