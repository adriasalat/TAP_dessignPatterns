package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrià Salat
 * Subject: manages subscriptions and notifies observers
 * when its internal state changes (temperature in this example).
 */
public class Subject {

    // Registered observers that will be notified on changes
    private final List<Observer> observers = new ArrayList<>();

    // Example of state to be observed
    private double temperatureCelsius = 0.0;

    /**
     * Subscribe an observer to notifications.
     * @param o non-null observer
     */
    public void attach(Observer o) {
        if (o == null) return;
        observers.add(o);
    }

    /**
     * Unsubscribe an observer from notifications.
     * @param o observer to remove
     */
    public void detach(Observer o) {
        observers.remove(o);
    }

    /**
     * Notify all registered observers that state has changed.
     */
    protected void notifyAllObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    /**
     * Set a new temperature and notify observers.
     * This is the single point of mutation that triggers updates.
     */
    public void setTemperatureCelsius(double value) {
        this.temperatureCelsius = value;
        notifyAllObservers();
    }

    /**
     * Observers can pull the state they need from the Subject.
     * This keeps update() simple and the Subject decoupled from observers’ formats.
     */
    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }
}
