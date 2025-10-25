package strategy;

/**
 * @author Adrià Salat
 * Demo: shows how changing the strategy changes the output,
 * with minimal code and crystal-clear behavior.
 */
public class UseStrategy {
    public static void main(String[] args) {
        Greeter greeter = new Greeter(new PlainGreeter());

        greeter.sayHello("Adria");      // Hello, Adria
        greeter.setStrategy(new UpperGreeter());
        greeter.sayHello("Adria");      // HELLO, Adria
        greeter.setStrategy(new ExcitedGreeter());
        greeter.sayHello("Adria");      // Hello, Adria!!
    }
}
