package observer;

/**
 * @author Adrià Salat
 * Observer interface: any display/consumer that wants to be notified
 * when the Subject (WeatherStation) changes its state implements this.
 */
public interface Observer {
    /**
     * Called by the Subject on each state change to notify observers.
     */
    public void update();
}
