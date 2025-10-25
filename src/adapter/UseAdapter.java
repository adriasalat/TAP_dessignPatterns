package adapter;

/**
 * @author Adrià Salat
 * Client: uses only the Target interface (NewPrinter).
 * It remains unaware of OldPrinter thanks to the Adapter.
 */
public class UseAdapter {

    public static void main(String[] args) {
        // 1) Create the legacy printer (Adaptee) we want to reuse
        OldPrinter legacy = new OldPrinter();

        // 2) Wrap it with the Adapter so it matches the Target API
        NewPrinter printer = new OldPrinterAdapter(legacy);

        // 3) Use the Target interface; the client does not know about OldPrinter
        String result = printer.print("Hello World!");

        System.out.println("Result: " + result);
    }
}
