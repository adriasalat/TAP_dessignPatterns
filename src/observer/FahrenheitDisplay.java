package observer;

/**
 * @author Adrià Salat
 * Concrete Observer: converts to Fahrenheit and displays it.
 */
public class FahrenheitDisplay implements Observer {

    private final Subject subject;

    public FahrenheitDisplay(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        double c = subject.getTemperatureCelsius();
        double f = c * 9.0 / 5.0 + 32.0;
        System.out.println("[FahrenheitDisplay] " + f + " °F");
    }
}
