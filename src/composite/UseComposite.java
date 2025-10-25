package composite;

/**
 * @author Adrià Salat
 * Client: builds a tree and invokes the uniform API (size) on any node.
 */
public class UseComposite {

    public static void main(String[] args) {
        // Build a small tree
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory tap = new Directory("tap");

        File f1 = new File("f1", 1234);
        File f2 = new File("f2", 3445);
        File f3 = new File("f3", 6688);
        File f4 = new File("lp", 99999);

        root.add(home);
        root.add(f1);
        home.add(tap);
        home.add(f2);
        tap.add(f3);
        root.add(f4);

        // Uniform calls: same API for leaf and composite
        System.out.println("Root: " + root.name() + ", SIZE=" + root.size());
        System.out.println("Home: " + home.name() + ", SIZE=" + home.size());
        System.out.println("Tap: " + tap.name()  + ", SIZE=" + tap.size());
        System.out.println("f1: " + f1.name()   + ", SIZE=" + f1.size());
    }
}
