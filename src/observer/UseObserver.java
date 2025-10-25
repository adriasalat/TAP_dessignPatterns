package observer;

/**
 * @author Adrià Salat
 * Client demo:
 * - Creates a Subject (WeatherStation)
 * - Registers three observers with different behaviors
 * - Changes the temperature multiple times to show automatic notifications
 */
public class UseObserver {

    public static void main(String[] args) {
        Subject weatherStation = new Subject();

        // Register observers (they self-attach in their constructors)
        new CelsiusDisplay(weatherStation);
        new FahrenheitDisplay(weatherStation);
        new AlertObserver(weatherStation, 30.0); // threshold at 30 °C

        System.out.println("=== Setting temperature to 22.5 °C ===");
        weatherStation.setTemperatureCelsius(22.5);

        System.out.println("\n=== Setting temperature to 29.9 °C ===");
        weatherStation.setTemperatureCelsius(29.9);

        System.out.println("\n=== Setting temperature to 33.2 °C ===");
        weatherStation.setTemperatureCelsius(33.2);

        // Optional: demonstrate detach
        // You could keep references to observers and call weatherStation.detach(observerRef);
    }
}
