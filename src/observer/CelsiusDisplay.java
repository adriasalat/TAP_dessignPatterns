package observer;

/**
 * @author Adrià Salat
 * Concrete Observer: displays the temperature in Celsius.
 */
public class CelsiusDisplay implements Observer {

    private final Subject subject;

    /**
     * Register itself on construction to start receiving updates.
     */
    public CelsiusDisplay(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        double c = subject.getTemperatureCelsius();
        System.out.println("[CelsiusDisplay] " + c + " °C");
    }
}
