package observer;

/**
 * @author Adrià Salat
 * Concrete Observer: emits a warning if temperature exceeds a threshold.
 */
public class AlertObserver implements Observer {

    private final Subject subject;
    private final double thresholdCelsius;

    public AlertObserver(Subject subject, double thresholdCelsius) {
        this.subject = subject;
        this.thresholdCelsius = thresholdCelsius;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        double c = subject.getTemperatureCelsius();
        if (c >= thresholdCelsius) {
            System.out.println("[AlertObserver] ALERT: temperature >= " + thresholdCelsius + " °C (" + c + " °C)");
        } else {
            System.out.println("[AlertObserver] OK: " + c + " °C");
        }
    }
}
